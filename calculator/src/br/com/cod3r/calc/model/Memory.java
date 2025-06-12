package br.com.cod3r.calc.model;

public class Memory {

    private static final Memory memory = new Memory();

    private String currentText = "";

    private Memory() {} // Prevent more than one instantiation

    public static Memory getInstance() {
        return memory;
    }

    public String getCurrentText() {
        return currentText.isEmpty() ? "0" : currentText;
    }
}
