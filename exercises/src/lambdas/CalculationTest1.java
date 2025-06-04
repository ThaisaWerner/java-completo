package lambdas;

public class CalculationTest1 {
    public static void main(String[] args) {

        Calculation calculation = new Sum();
        System.out.println("Sum: " + calculation.execute(5, 3));

        calculation = new Multiply();
        System.out.println("Multiply: " + calculation.execute(5, 3));
    }
}
