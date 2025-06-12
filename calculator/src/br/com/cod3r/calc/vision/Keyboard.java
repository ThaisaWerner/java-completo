package br.com.cod3r.calc.vision;

import br.com.cod3r.calc.model.Memory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JPanel is a Swing component that can be used to create a panel for the calculator keyboard.
// ActionListener is an interface that receives action events, such as button clicks.
public class Keyboard extends JPanel implements ActionListener {

    private final Color DARK_PINK = new Color(255, 175, 204);
    private final Color LIGHT_PINK = new Color(255, 200, 221);
    private final Color PURPLE = new Color(205, 180, 219);

    public Keyboard() {

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();

        setLayout(layout);

        constraints.weightx = 1;
        constraints.weighty = 1; // Each button will take up equal space in the grid
        constraints.fill = GridBagConstraints.BOTH; // Fill the cell in both directions

        constraints.gridwidth = 1;
        addButton("C", DARK_PINK, constraints, 0, 0);
        addButton("+", DARK_PINK, constraints, 1, 0);
        addButton("%", DARK_PINK, constraints, 2, 0);
        addButton("/", PURPLE, constraints, 3, 0);

        addButton("7", LIGHT_PINK, constraints, 0, 1);
        addButton("8", LIGHT_PINK, constraints, 1, 1);
        addButton("9", LIGHT_PINK, constraints, 2, 1);
        addButton("*", PURPLE, constraints, 3, 1);

        addButton("4", LIGHT_PINK, constraints, 0, 2);
        addButton("5", LIGHT_PINK, constraints, 1, 2);
        addButton("6", LIGHT_PINK, constraints, 2, 2);
        addButton("-", PURPLE, constraints, 3, 2);

        addButton("1", LIGHT_PINK, constraints, 0, 3);
        addButton("2", LIGHT_PINK, constraints, 1, 3);
        addButton("3", LIGHT_PINK, constraints, 2, 3);
        addButton("+", PURPLE, constraints, 3, 3);

        constraints.gridwidth = 2;
        addButton("0", LIGHT_PINK, constraints, 0, 4);
        constraints.gridwidth = 1;
        addButton(",", LIGHT_PINK, constraints, 2, 4);
        addButton("=", PURPLE, constraints, 3, 4);
    }

    // Method to add a button to the keyboard panel with specified text, color, and position.
    private void addButton(String text, Color color, GridBagConstraints constraints, int x, int y) {
        constraints.gridx = x;
        constraints.gridy = y;
        Button button = new Button(text, color);
        button.addActionListener(this); // Registering the action listener to handle button clicks. Here will happen what is in the actionPerformed method.
        add(button, constraints);
    }

    // This method will handle button click events.
    @Override
    public void actionPerformed(ActionEvent event) {
        //checks whether the source of the event (the component that triggered the action) is an instance of JButton.
        if(event.getSource() instanceof JButton) {
            JButton button = (JButton) event.getSource(); // Getting the button that was clicked. The click source.
            Memory.getInstance().proccessInput(button.getText()); // Processing the input from the button and updating the memory.
        }

    }
}
