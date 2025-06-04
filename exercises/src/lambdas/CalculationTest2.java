package lambdas;

public class CalculationTest2 {
    public static void main(String[] args) {

        //Lambda function. This way we can implements the interface Calculation directly without the need of create new classes.
        Calculation calculation = (a, b) -> {
            return a + b;
        };

        //or

        calculation = (a, b) -> a * b;
    }
}
