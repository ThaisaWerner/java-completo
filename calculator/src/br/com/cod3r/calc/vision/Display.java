package br.com.cod3r.calc.vision;

import br.com.cod3r.calc.model.Memory;
import br.com.cod3r.calc.model.MemoryObserver;

import javax.swing.*;
import java.awt.*;

// JPanel is a Swing component that can be used to create a panel for the calculator display.
// MemoryObserver is an interface that allows the Display to be notified of changes in the Memory.
public class Display extends JPanel implements MemoryObserver {

    private final JLabel label; // JLabel is a Swing component that can be used to display text or images.

    public Display() {

        Memory.getInstance().addObserver(this); // Registering this Display as an observer of Memory to receive updates.

        setBackground(new Color(46, 49, 50));
        label = new JLabel(Memory.getInstance().getCurrentText());
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Courier", Font.PLAIN, 24));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));

        add(label);
    }

    // This method is called when the Memory changes, allowing the Display to update its label to reflect the new value.
    @Override
    public void changedValue(String newValue) {
        label.setText(newValue);
    }
}
