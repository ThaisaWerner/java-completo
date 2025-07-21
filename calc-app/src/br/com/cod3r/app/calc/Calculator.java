package br.com.cod3r.app.calc;

import br.com.cod3r.app.calc.internal.arithmeticOperations;

public class Calculator {

    private arithmeticOperations arithmeticOperations = new arithmeticOperations();

    public double sum(double... nums) {
        return arithmeticOperations.sum(nums);
    }
}
