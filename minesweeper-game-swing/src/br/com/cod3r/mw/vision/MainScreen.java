package br.com.cod3r.mw.vision;

import br.com.cod3r.mw.model.Board;

import javax.swing.*;

public class MainScreen extends JFrame {

    public MainScreen() {
        Board board = new Board(16, 30, 50);
        add(new BoardPanel(board));

        setTitle("Minesweeper");
        setSize(690, 438);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {

        new MainScreen();
    }
}
