package br.com.cod3r.mw.vision;

import br.com.cod3r.mw.model.Board;

public class Temp {
    public static void main(String[] args) {

        Board board = new Board(3, 3, 9);
        board.registerObserver(e -> {
            if (e.isWin()) {
                System.out.println("You won!");
            } else {
                System.out.println("You lost!");
            }
        });

        board.rotateTag(0, 0);
        board.rotateTag(0, 1);
        board.rotateTag(0, 2);
        board.rotateTag(1, 0);
        board.rotateTag(1, 1);
        board.rotateTag(1, 2);
        board.rotateTag(2, 0);
        board.rotateTag(2, 1);
        board.rotateTag(2, 2);
    }
}
