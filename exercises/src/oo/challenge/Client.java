package oo.challenge;

import java.util.List;

public class Client {

    String clientName;
    List<Purchase> purchases;

    double totalSpent() {
        double total = 0;
        for (Purchase purchase : purchases) {
            total += purchase.obtainTotalPurchase();
        }
        return total;
    }
}
