package lambdas;

import java.util.List;
import java.util.Arrays;

public class Foreach {
    public static void main(String[] args) {

        List<String> approved = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println(approved);

        //Passing a lambda expression as parameter to the foreach expression
        approved.forEach((name) -> {
            System.out.println("Approved: " + name);
        });

        //Using a method reference
        approved.forEach(System.out::println);

        //Using a lambda expression with a method
        approved.forEach(name -> impression(name));

        //Using a method reference with a method
        approved.forEach(Foreach::impression);
    }

    static void impression(String name) {
        System.out.println("Approved: " + name);
    }
}
