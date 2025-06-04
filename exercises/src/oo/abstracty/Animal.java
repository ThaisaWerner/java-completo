package oo.abstracty;

public abstract class Animal {

    public String breathe() {
        return "CO2";
    }

    // We can mark a method as abstract if we don't know how to implement it yet.
    // Abstracts methods only exists in abstract classes
    // Abstract method, must be implemented by subclasses
    public abstract String move();
}
