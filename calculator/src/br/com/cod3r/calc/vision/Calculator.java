package br.com.cod3r.calc.vision;

import javax.swing.*;

public class Calculator extends JFrame {

    public Calculator() {
        setVisible(true); // Creating screen
        setSize(232, 322); // Setting the size of the screen
        setLocationRelativeTo(null); // Centering the screen on the monitor
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Closing the application when the window is closed
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
