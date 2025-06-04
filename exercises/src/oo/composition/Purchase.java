package oo.composition;

import java.util.ArrayList;

public class Purchase {

    String client; //In a real application, this would be a Client object
    ArrayList<Item> items = new ArrayList<>();

    void addItem (Item item) {
        items.add(item);
        item.purchase = this; //The same time we add Item to the Purchase, we add Purchase to the Item
    }

    double getTotal() {
        double total = 0;

        for(Item item : items) {
            total += item.price * item.quantity;
        }

        return total;
    }
}
