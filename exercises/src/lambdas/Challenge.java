package lambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Challenge {
    public static void main(String[] args) {

        /*
        1. From a product, calculate the final price after applying the discount.
        2. Municipal tax: >=2500 (8.5%) / < 2500 (free)
        3. Shipping: >= 3000 (100) / < 3000 (50)
        4. Round to two decimal places
        5. Format: R$ 1234,56
         */
        Function<Product, Double> discountPrice = product -> product.price * (1 - product.discount);

        Product product = new Product("Ipad", 3235.89, 0.13);

        //Could be done with unary operator
        Function<Double, Double> municipalTax = price -> price >= 2500 ? price * (1 + 0.085) : price * (1);

        //Could be done with unary operator
        Function<Double, Double> shipping = price -> price >= 3000 ? price + 100 : price + 50;

        //Could be divided into two functions
        Function<Double, String> priceFormated = finalPrice -> {
            java.text.DecimalFormat formated = new java.text.DecimalFormat("R$ ###0.00");
            return formated.format(finalPrice).replace('.', ',');
        };

        System.out.println(discountPrice.andThen(municipalTax).andThen(shipping).andThen(priceFormated).apply(product));
    }
}
