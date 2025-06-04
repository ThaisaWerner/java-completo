package br.com.cod3r.mw.model;

import br.com.cod3r.mw.exception.ExplosionException;
import com.amazonaws.services.s3.transfer.internal.CopyPartCallable;

import java.util.ArrayList;
import java.util.List;

public class Field {

    private final int row;
    private final int column;

    private boolean opened;
    private boolean mined;
    private boolean marked;

    private List<Field> neighbors = new ArrayList<>();

    Field(int row, int column) {
        this.row = row;
        this.column = column;
    }

    boolean addNeighbor(Field neighbor) {
        boolean diffentLRow = row != neighbor.row;
        boolean differentColumn = column != neighbor.column;
        boolean diagonal = diffentLRow && differentColumn;

        int deltaRow = Math.abs(row - neighbor.row);
        int deltaColumn = Math.abs(column - neighbor.column);
        int deltaGeneral = deltaRow + deltaColumn;

        if(deltaGeneral == 1 && !diagonal) {
            neighbors.add(neighbor);
            return true;
        } else if (deltaGeneral == 2 && diagonal) {
            neighbors.add(neighbor);
            return true;
        } else {
            return false;
        }
    }

    void rotateTag() {
        if(!opened) {
            marked = !marked;
        }
    }

    boolean open() {
        if(!opened && !marked) {
            opened = true;

            if(mined) {
                throw new ExplosionException();
            }

            if(secureNeihborhood()) {
                neighbors.forEach(n -> n.open());
            }
            return true;
        } else {
            return false;
        }
    }

    boolean secureNeihborhood() {
        return neighbors.stream().noneMatch(n -> n.mined);
    }

    void mine() {
        mined = true;
    }

    public boolean isMined() {
        return mined;
    }

    public boolean isMarked() {
        return marked;
    }

    void setOpen(boolean opened) {
        this.opened = opened;
    }

    public boolean isOpen() {
        return opened;
    }

    public boolean isClosed() {
        return !isOpen();
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    boolean objectiveAchieved() {
        boolean unveiled = !mined && opened;
        boolean secured = mined && marked;
        return unveiled || secured;
    }

    long minesInTheNeighborhood() {
        return neighbors.stream()
                .filter(n -> n.mined)
                .count();
    }

    void restart() {
        opened = false;
        mined = false;
        marked = false;
    }

    public String toString() {
        if(marked) {
            return "x";
        } else if(opened && mined) {
            return "*";
        } else if(opened && minesInTheNeighborhood() > 0) {
            return Long.toString(minesInTheNeighborhood());
        } else if(opened) {
            return " ";
        } else {
            return "?";
        }
    }
}
