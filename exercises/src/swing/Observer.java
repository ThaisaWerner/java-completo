package swing;

import javax.swing.*;
import java.awt.*;

public class Observer {
    public static void main(String[] args) {

        JFrame window = new JFrame("Observer Example");

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600, 200);
        window.setLayout(new FlowLayout());
        window.setLocationRelativeTo(null); // Center the window on the screen

        JButton button = new JButton("Click Me!");
        window.add(button);

        button.addActionListener(e -> {
            System.out.println("Button was clicked!");
        });

        window.setVisible(true);
    }
}
