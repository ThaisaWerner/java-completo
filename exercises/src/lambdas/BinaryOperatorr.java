package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorr {
    public static void main(String[] args) {

        BinaryOperator<Double> average = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(average.apply(10.0, 7.0));

        BiFunction<Double, Double, String> result = (n1, n2) -> {
            double finalGrade = (n1 + n2) / 2;
            return finalGrade >= 7 ? "Passed" : "Failed";
        };
        System.out.println(result.apply(10.0, 7.0));

        //Or we can do the same as result but using function composition

        Function<Double, String> concept = finalGrade -> finalGrade >= 7 ? "Passed" : "Failed";
        System.out.println(average.andThen(concept).apply(10.0, 7.0));
    }
}
