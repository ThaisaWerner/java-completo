package br.com.cod3r.app.calc.internal;

import java.util.Arrays;

public class arithmeticOperations {

    public double sum(double... nums) {
        return Arrays.stream(nums).reduce(0.0, (t, a) -> t + a);
    }
}
