package br.com.cod3r.calc.model;

import java.util.ArrayList;
import java.util.List;

public class Memory {

    private enum CommandType {
        RESET, SIGNAL, NUMBER, DIVISION, MULTIPLICATION, SUBTRACTION, ADDITION, EQUAL, COMMA;
    }

    private static final Memory memory = new Memory();

    // List of observers that will be notified when the memory value changes
    // Storage all observers registered in addObserver
    private final List<MemoryObserver> observers = new ArrayList<>();

    private CommandType lastOperation = null;
    private boolean replace = false;
    private String currentText = "";
    private String bufferText = "";

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

        if(commandType == null) {
            return; // Ignore invalid input
        } else if(commandType == CommandType.RESET) {
            currentText = "";
            bufferText = "";
            replace = false;
            lastOperation = null;
        } else if(commandType == CommandType.SIGNAL && currentText.contains("-")) {
            currentText = currentText.substring(1);
        } else if(commandType == CommandType.SIGNAL && !currentText.contains("-")) {
            currentText = "-" + currentText;
        }else if(commandType == CommandType.NUMBER || commandType == CommandType.COMMA) {
            currentText = replace ? value : currentText + value; // Append the value to currentText if not replacing
            replace = false;
        } else {
            replace = true; // Set replace to true for the next number input
            currentText = getResultOperation();// Get the result of the last operation before applying the new operation
            bufferText = currentText; // Store the current text or the result of last operation in bufferText before applying the new operation
            lastOperation = commandType; // Update the last operation based on the command type

        }

        observers.forEach(observer -> observer.changedValue(getCurrentText()));
    }

    private String getResultOperation() {
        if(lastOperation == null || lastOperation == CommandType.EQUAL) {
            return currentText; // If no operation was performed, return the current text
        }

        double numberBuffer = Double.parseDouble(bufferText.replace(",", "."));
        double currentNumber = Double.parseDouble(currentText.replace(",", "."));

        double result = 0;

        if(lastOperation == CommandType.ADDITION) {
            result = numberBuffer + currentNumber;
        } else if(lastOperation == CommandType.SUBTRACTION) {
            result = numberBuffer - currentNumber;
        } else if(lastOperation == CommandType.MULTIPLICATION) {
            result = numberBuffer * currentNumber;
        } else if(lastOperation == CommandType.DIVISION) {
            result = numberBuffer / currentNumber;
        }

        String resultString = Double.toString(result).replace(".", ","); // Convert the result to a string and replace '.' with ',' for display
        boolean isInteger = resultString.endsWith(",0"); // Check if the result is an integer (ends with ',0')
        return isInteger ? resultString.replace(",0", "") : resultString; // If it's an integer, remove the ',0' part
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
            } else if ("±".equals(value)) {
                return CommandType.SIGNAL;
            } else if (",".equals(value) && !currentText.contains(",")) {
                return CommandType.COMMA;
            }
        }
        return null;
    }
}
