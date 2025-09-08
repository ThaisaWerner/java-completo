package model.onetomany;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date date;

    //One order can have many items
    //Creating a bidirectional relationship
    @OneToMany(mappedBy = "order")
    private List<ItemOrdered> items;

    public Order() {
        this(new Date());
    }

    public Order(Date date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public List<ItemOrdered> getItems() {
        return items;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setItems(List<ItemOrdered> items) {
        this.items = items;
    }
}
