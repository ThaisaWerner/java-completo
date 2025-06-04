package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterChallenge {
    /*
    Filter products with discount greater than 30% and products with free shipping
    Product with the attributes: price, name, discount, free shipping
    Map with name, price and super promotion
     */
    public static void main(String[] args) {

        Product product1 = new Product("Notebook", 5000, 0.3, true);
        Product product2 = new Product("Smartphone", 2000, 0.4, false);
        Product product3 = new Product("Tablet", 1500, 0.2, true);
        Product product4 = new Product("Smartwatch", 1000, 0.5, true);
        Product product5 = new Product("Headphones", 500, 0.1, false);
        Product product6 = new Product("Monitor", 3000, 0.35, true);

        List<Product> products = Arrays.asList(product1, product2, product3, product4, product5, product6);

        Predicate<Product> discountGreaterThan30 = p -> p.discount >= 0.3;
        Predicate<Product> freeShipping = p -> p.freeShipping;
        Function<Product, String> superPromotion = p -> "Super promotion: " + p.name + " R$" + p.price + " with discount of " + p.discount + "% and free shipping!";

        products.stream()
                .filter(discountGreaterThan30)
                .filter(freeShipping)
                .map(superPromotion)
                .forEach(System.out::println);
    }
}
