package streams;

public class Product {

    final String name;
    final double price;
    final double discount;
    final boolean freeShipping;

    public Product(String name, double price, double discount, boolean freeShipping) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.freeShipping = freeShipping;
    }
}
