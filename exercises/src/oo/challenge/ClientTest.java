package oo.challenge;

import java.util.List;

public class ClientTest {
    public static void main(String[] args) {
        Client client = new Client();
        client.clientName = "John Doe";
        //A list of purchases -> then create a new purchase -> a purchase is made of a list of items -> create a new item ->
        //an item is made of a product and your quantity -> create a new product passing the name and price
        client.purchases = List.of(
                new Purchase(List.of(new Item(new Product("Laptop", 1200.00), 1),
                        new Item(new Product("Headphones", 150.00), 1))),
                new Purchase(List.of(new Item(new Product("Mouse", 25.00), 2),
                        new Item(new Product("Keyboard", 45.00), 1)))
        );

        //The way the professor did. I had to remove the constructor to make it work
//        Purchase purchase1 = new Purchase();
//        purchase1.addItem("Monitor", 300.00, 1);
//        purchase1.addItem(new Product("Printer", 200.00), 1);
//        client.purchases.add(purchase1);

        System.out.println(client.totalSpent());
    }
}
