package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> sum = (ac, n) -> ac + n;

        Integer total1 = numbers.stream().reduce(sum).get();
        System.out.println("Total: " + total1);

        //Because we passed a default value of 0, we don't need to call get() on the result
        Integer total2 = numbers.stream().reduce(0, sum);
        System.out.println("Total: " + total2);

        numbers.stream()
                .filter(n -> n > 5)
                .reduce(sum)
                .ifPresent(System.out::println);
    }
}
