package oo.abstracty;

public class Dog extends Mammal {

//Here I have to implement the two not implemented methods from Animal and Mammal

    @Override
    public String move() {
        return "running";
    }

    @Override
    public String feed() {
        return "eating meat";
    }
}
