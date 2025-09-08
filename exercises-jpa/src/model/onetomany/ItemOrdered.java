package model.onetomany;

import model.basic.Product;

import javax.persistence.*;

@Entity
public class ItemOrdered {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private Double price;

    //Many items can belong to one order
    @ManyToOne
    private Order order;

    //Many items can belong to one product
    @ManyToOne
    private Product product;

    public ItemOrdered() {
    }

    public ItemOrdered(int quantity, Order order, Product product) {
        this.setQuantity(quantity);
        this.setOrder(order);
        this.setProduct(product);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
        if(product != null && this.price == null) {
            this.setPrice(product.getPrice());
        }
    }
}
