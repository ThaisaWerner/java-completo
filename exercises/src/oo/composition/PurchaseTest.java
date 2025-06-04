package oo.composition;

public class PurchaseTest {
    public static void main(String[] args) {

        Purchase purchase1 = new Purchase();
        purchase1.client = "John Doe";
        purchase1.addItem(new Item("Pen", 20, 7.45));
        purchase1.addItem(new Item("Notebook", 3, 15.90));
        purchase1.addItem(new Item("Eraser", 5, 2.50));

        System.out.println(purchase1.getTotal());
    }
}
