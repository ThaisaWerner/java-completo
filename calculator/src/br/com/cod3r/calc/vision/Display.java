package br.com.cod3r.calc.vision;

import br.com.cod3r.calc.model.Memory;

import javax.swing.*;
import java.awt.*;

// JPanel is a Swing component that can be used to create a panel for the calculator display.
public class Display extends JPanel {

    private final JLabel label; // JLabel is a Swing component that can be used to display text or images.

    public Display() {
        setBackground(new Color(46, 49, 50));
        label = new JLabel(Memory.getInstance().getCurrentText());
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Courier", Font.PLAIN, 24));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));

        add(label);
    }
}
