package fundamentals;

public class Temperature {

    public static void main(String[] args) {

        final double SUBTRACTOR = 32;
        final double MULTIPLIER = 5.0 / 9.0;

        double fahrenheit = 86;
        double celsius = (fahrenheit - SUBTRACTOR) * MULTIPLIER;

        System.out.println("Celsius: " + celsius);

        //Formula -> (F - 32) * 5/9 = C
    }
}
