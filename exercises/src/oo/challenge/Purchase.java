package oo.challenge;

import java.util.List;

public class Purchase {

    List<Item> items;

    double obtainTotalPurchase() {
        double totalPurchase = 0;
        for (Item item : items) {
            totalPurchase += item.product.price * item.quantity;
        }
        return totalPurchase;
    }

    public Purchase(List<Item> items) {
        this.items = items;
    }

    //The way the professor did
    void addItem(String name, double price, int quantity) {
        var product = new Product(name, price);
        this.items.add(new Item(product, quantity));
    }
}
