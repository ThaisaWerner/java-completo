package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MapChallenge {
    public static void main(String[] args) {

        /*
        1. Number to binary string... 6 => "110"
        2. Invert string... "110" => "011"
        3. Convert back to integer ... "011" => 3
         */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Function<Integer, String> toBinary = Integer::toBinaryString;
        UnaryOperator<String> invert = s -> new StringBuilder(s).reverse().toString();
        Function<String, Integer> toInteger = s -> Integer.parseInt(s, 2);

        numbers.stream()
                .map(toBinary)
                .map(invert)
                .map(toInteger)
                .forEach(System.out::println);
    }
}
