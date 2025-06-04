package lambdas;

import java.util.function.UnaryOperator;

public class UnaryOperatorr {
    public static void main(String[] args) {

        UnaryOperator<Integer> plusTwo = number -> number + 2;
        UnaryOperator<Integer> timesTwo = number -> number * 2;
        UnaryOperator<Integer> square = number -> number * number;

        int result1 = plusTwo.andThen(timesTwo).andThen(square).apply(5);
        System.out.println(result1);

        //Do the same but starting from the end
        int result2 = square.compose(timesTwo).compose(plusTwo).apply(5);
    }
}
