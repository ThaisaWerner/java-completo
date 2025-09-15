package model.composition;

import javax.persistence.Embeddable;

//The address will be placed inside the supplier and employee table and when the tables are generated, the attributes of address will be in the supplier and employee table also.
@Embeddable
public class Address {

    private String street;
    private String number;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
