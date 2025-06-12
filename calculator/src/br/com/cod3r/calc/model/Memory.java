package br.com.cod3r.calc.model;

import java.util.ArrayList;
import java.util.List;

public class Memory {

    private static final Memory memory = new Memory();

    // List of observers that will be notified when the memory value changes
    // Storage all observers registered in addObserver
    private final List<MemoryObserver> observers = new ArrayList<>();

    private String currentText = "";

    private Memory() {} // Prevent more than one instantiation

    public static Memory getInstance() {
        return memory;
    }

    // Register an observer to be notified of changes in memory
    public void addObserver(MemoryObserver observer) {
        observers.add(observer);
    }

    public String getCurrentText() {
        return currentText.isEmpty() ? "0" : currentText;
    }

    // Process input value and notify all observers of the change
    public void proccessInput(String value) {

        if("C".equals(value)) {
            currentText = "";
        } else {
            currentText += value;
        }

        observers.forEach(observer -> observer.changedValue(getCurrentText()));
    }
}
