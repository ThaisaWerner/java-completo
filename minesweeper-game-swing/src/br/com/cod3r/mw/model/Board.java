package br.com.cod3r.mw.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class Board {

    private int rows;
    private int columns;
    private int mines;

    private final List<Field> fields = new ArrayList<>();

    public Board(int rows, int columns, int mines) {
        this.rows = rows;
        this.columns = columns;
        this.mines = mines;

        generateFields();
        associateNeighboors();
        drawMines();
    }

    public void open(int row, int column) {
        try {
            fields.stream()
                    .filter(f -> f.getRow() == row && f.getColumn() == column)
                    .findFirst()
                    .ifPresent(f -> f.open());
        } catch (Exception e) {
            //FIXME: ajustar implementação do método abrir
            fields.forEach(f -> f.setOpen(true));
            throw e;
        }
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
                fields.add(new Field(l, c));
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
}
