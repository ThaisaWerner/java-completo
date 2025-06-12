package br.com.cod3r.calc.vision;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {

    public Button(String text, Color color) {
        setText(text);
        setFont(new Font("Courier", Font.PLAIN, 16));
        setOpaque(true);
        setBackground(color);
        setForeground(Color.GRAY);
        setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }
}
