package test.onetomany;

import infra.DAO;
import model.basic.Product;
import model.onetomany.ItemOrdered;
import model.onetomany.Order;

public class NewOrder {
    public static void main(String[] args) {

        DAO<Object> dao = new DAO<>();

        Order order = new Order();
        Product product = new Product("Monitor", 789.88);
        ItemOrdered item = new ItemOrdered(10, order, product);

        dao.openTransaction()
                .insert(product)
                .insert(order)
                .insert(item)
                .closeTransaction()
                .close();
    }
}
