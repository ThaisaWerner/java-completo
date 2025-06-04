package lambdas;

public class Sum implements Calculation {

    @Override
    public double execute(double a, double b) {
        return a + b;
    }
}
