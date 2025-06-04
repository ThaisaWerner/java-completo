package lambdas;

import java.util.function.Function;

public class Functionn {
    public static void main(String[] args) {

        Function<Integer, String> evenOrOdd = number -> number % 2 == 0 ? "Even" : "Odd";

        System.out.println(evenOrOdd.apply(10));

        Function<String, String> result = value -> "The result is: " + value;

        Function<String, String> excited = value -> value + "!!!";

        //Functional composition
        String finalResult = evenOrOdd.andThen(result).andThen(excited).apply(10);

        System.out.println(finalResult);
    }
}
