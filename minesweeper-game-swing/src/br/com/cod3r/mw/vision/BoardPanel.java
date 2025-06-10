package br.com.cod3r.mw.vision;

import br.com.cod3r.mw.model.Board;

import javax.swing.*;
import java.awt.*;

public class BoardPanel extends JPanel {

    public BoardPanel(Board board) {

        setLayout(new GridLayout(board.getRows(), board.getColumns()));

        board.forEachField(f -> add(new FieldButton(f)));
        board.registerObserver(e -> {

            SwingUtilities.invokeLater(() -> {
                if(e.isWin()) {
                    JOptionPane.showMessageDialog(this, "Congratulations! You won!");
                } else {
                    JOptionPane.showMessageDialog(this, "You lost!");
                }

                board.restart();
            });
        });

    }

}
