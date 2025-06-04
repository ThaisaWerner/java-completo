package lambdas;

import java.util.function.Predicate;

public class Predicaty {
    public static void main(String[] args) {

        Predicate<Product> isExpensive = product -> (product.price * (1 - product.discount)) >= 750;

        Product product1 = new Product("Laptop", 5000, 0.10);

        System.out.println(isExpensive.test(product1));
        
    }
}
