package oo.composition;

public class Item {

    String name;
    int quantity;
    double price;
    Purchase purchase; //Creating a bilateral relationship between Item and Purchase

    Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
