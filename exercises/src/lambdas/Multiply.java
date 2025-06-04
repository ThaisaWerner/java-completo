package lambdas;

public class Multiply implements Calculation {

    @Override
    public double execute(double a, double b) {
        return a * b;
    }

}
