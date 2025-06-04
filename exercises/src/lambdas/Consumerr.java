package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumerr {
    public static void main(String[] args) {

        Consumer<Product> print = product -> System.out.println((product.name));

        Product product1 = new Product("Laptop", 5000, 0.10);
        Product product2 = new Product("Pen", 12.34, 0.10);
        Product product3 = new Product("Pencil", 4.39, 0.10);
        Product product4 = new Product("Eraser", 7.80, 0.10);
        Product product5 = new Product("Notebook", 19.90, 0.10);

        List<Product> products = Arrays.asList(product1, product2, product3, product4, product5);

        // Print it's the exactly type of the lambda expression that forEach expects, a consumer.
        products.forEach(print);

        // We can do also using a lambda expression directly
        products.forEach(product -> System.out.println(product.price));

        // We can do also using a method reference
        products.forEach(System.out::println);
    }
}
