package br.com.cod3r.calc.model;

import java.util.ArrayList;
import java.util.List;

public class Memory {

    private enum CommandType {
        RESET, NUMBER, DIVISION, MULTIPLICATION, SUBTRACTION, ADDITION, EQUAL, COMMA;
    }

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

        CommandType commandType = detectCommandType(value);
        System.out.println(commandType);

        if("C".equals(value)) {
            currentText = "";
        } else {
            currentText += value;
        }

        observers.forEach(observer -> observer.changedValue(getCurrentText()));
    }

    private CommandType detectCommandType(String value) {
        if(currentText.isEmpty() && value == "0") {
            return null;
        }

        try {
            Integer.parseInt(value); // This identifies if the value is a number.
            return CommandType.NUMBER;
        } catch (NumberFormatException e) {
            //When the value is not a number...
            if("C".equals(value)) {
                return CommandType.RESET;
            } else if ("/".equals(value)) {
                return CommandType.DIVISION;
            } else if ("*".equals(value)) {
                return CommandType.MULTIPLICATION;
            } else if ("-".equals(value)) {
                return CommandType.SUBTRACTION;
            } else if ("+".equals(value)) {
                return CommandType.ADDITION;
            } else if ("=".equals(value)) {
                return CommandType.EQUAL;
            } else if (",".equals(value)) {
                return CommandType.COMMA;
            }
        }
        return null;
    }
}
