package test.basic;

import infra.DAO;
import model.basic.Product;

public class NewProduct {
    public static void main(String[] args) {

        Product product = new Product("Monitor", 789.88);

        DAO<Product> dao = new DAO<>(Product.class);
        //dao.openTransaction().insert(product).closeTransaction().close();
        dao.atomicInsert(product).close();

        System.out.println("Product id: " + product.getId());

    }
}
