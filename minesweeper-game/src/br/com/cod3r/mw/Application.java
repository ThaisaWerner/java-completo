package br.com.cod3r.mw;

import br.com.cod3r.mw.model.Board;
import br.com.cod3r.mw.vision.ConsoleBoard;

public class Application {
    public static void main(String[] args) {

        Board board = new Board(6, 6, 3);
        new ConsoleBoard(board);
    }
}
