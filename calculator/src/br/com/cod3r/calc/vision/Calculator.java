package br.com.cod3r.calc.vision;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    public Calculator() {

        organizeLayout(); // Organizing the layout of the screen

        setVisible(true); // Creating screen
        setSize(232, 322); // Setting the size of the screen
        setLocationRelativeTo(null); // Centering the screen on the monitor
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Closing the application when the window is closed
    }

    private void organizeLayout() {
        setLayout(new BorderLayout()); // Setting the layout of the frame to BorderLayout, which allows components to be added in different regions of the frame.

        Display display = new Display();
        display.setPreferredSize(new Dimension(233, 60)); // Setting the preferred size of the display panel to 233x60 pixels.
        add(display, BorderLayout.NORTH); // Adding the display to the frame. This method is heritaged from JFrame.\

        Keyboard keyboard = new Keyboard();
        add(keyboard, BorderLayout.CENTER); // Adding the keyboard to the frame
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
