package lambdas;

import java.util.function.Predicate;

public class PredicatyComposition {
    public static void main(String[] args) {

        Predicate<Integer> isEven = number -> number % 2 == 0;
        Predicate<Integer> isThreeDigits = number -> number >= 100 && number <= 999;

        System.out.println(isEven.and(isThreeDigits).test(100));
        System.out.println(isEven.or(isThreeDigits).test(123));
    }
}
