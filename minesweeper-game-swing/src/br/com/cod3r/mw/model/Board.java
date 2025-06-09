package br.com.cod3r.mw.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class Board implements FieldObserver {

    private final int rows;
    private final int columns;
    private final int mines;

    private final List<Field> fields = new ArrayList<>();
    private final List<Consumer<EventResult>> observers = new ArrayList<>();

    public Board(int rows, int columns, int mines) {
        this.rows = rows;
        this.columns = columns;
        this.mines = mines;

        generateFields();
        associateNeighboors();
        drawMines();
    }

    public void forEachField(Consumer<Field> function) {
        fields.forEach(function);
    }

    public void registerObserver(Consumer<EventResult> observer) {
        observers.add(observer);
    }

    public void notifyObservers(boolean result) {
        observers.stream().forEach(o -> o.accept(new EventResult(result)));
    }

    public void open(int row, int column) {
        fields.stream()
                .filter(f -> f.getRow() == row && f.getColumn() == column)
                .findFirst()
                .ifPresent(f -> f.open());
    }

    public void rotateTag(int row, int column) {
        fields.stream()
                .filter(f -> f.getRow() == row && f.getColumn() == column)
                .findFirst()
                .ifPresent(f -> f.rotateTag());
    }

    private void generateFields() {
        for (int l = 0; l < rows; l++) {
            for (int c = 0; c < columns; c++) {
                Field field = new Field(l, c);
                field.registerObserver(this);
                fields.add(field);
            }
        }
    }

    private void associateNeighboors() {
        for(Field field1 : fields) {
            for (Field field2 : fields) {
                field1.addNeighbor(field2);
            }
        }
    }

    private void drawMines() {
        long armedMines = 0;
        Predicate<Field> mined = f -> f.isMined();

        do{
            int random = (int) (Math.random() * fields.size());
            fields.get(random).mine();
            armedMines = fields.stream().filter(mined).count();
        } while(armedMines < mines);
    }

    public boolean objectiveAchieved() {
        return fields.stream().allMatch(f -> f.objectiveAchieved());
    }

    public void restart() {
        fields.stream().forEach(f -> f.restart());
        drawMines();
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    @Override
    public void eventOccurred(Field field, FieldEvent event) {
        if(event == FieldEvent.EXPLODE) {
            showMines();
            notifyObservers(false);
        } else if(objectiveAchieved()) {
            notifyObservers(true);
        }
    }

    private void showMines() {
        fields.stream()
                .filter(f -> f.isMined())
                .forEach(f -> f.setOpen(true));
    }
}
