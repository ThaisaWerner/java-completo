package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {

        Consumer<String> print = System.out::println;

        List<String> brands = Arrays.asList("BMW", "Audi", "Honda", "Toyota", "Mercedes-Benz");
        brands.stream().map(b -> b.toUpperCase()).forEach(print);
        // Using method reference
        //brands.stream().map(String::toUpperCase).forEach(print);

        UnaryOperator<String> toUpperCase = n -> n.toUpperCase();
        UnaryOperator<String> firstLetter = n -> n.charAt(0) + "";
        UnaryOperator<String> exclamation = n -> n + "!!!";

        System.out.println("\nUsing composition:");
        brands.stream()
                .map(Utilities.toUpperCase)
                .map(firstLetter)
                .map(Utilities::exclamation)
                .forEach(print);

    }
}
