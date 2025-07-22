package br.com.cod3r.app.calc;

import br.com.cod3r.app.calc.internal.arithmeticOperations;
import br.com.cod3r.app.logging.Logger;

public class Calculator {

    private arithmeticOperations arithmeticOperations = new arithmeticOperations();

    public double sum(double... nums) {
        Logger.info("Sum started...");
        return arithmeticOperations.sum(nums);
    }
}
