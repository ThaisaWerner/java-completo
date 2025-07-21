package br.com.cod3r.app.financial;

import br.com.cod3r.app.calc.Calculator;

public class Test {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(2, 3, 4));
    }
}
