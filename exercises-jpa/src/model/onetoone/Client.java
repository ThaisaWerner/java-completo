package model.onetoone;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    //With CascadeType, when we persist the client he will persist the seat too
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "seat_id", unique = true)
    private Seat seat;

    public Client() {
    }

    public Client(String name, Seat seat) {
        this.seat = seat;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }
}
