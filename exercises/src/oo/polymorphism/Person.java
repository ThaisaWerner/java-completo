package oo.polymorphism;

public class Person {

    private double weight;

    public Person(double weight) {
        setWeight(weight);
    }

    public void eat(Food food) {
        this.weight += food.getWeight();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight >= 0) {
            this.weight = weight;
        }
    }

// The following methods are not needed because we are applying polymorphism

//    public void eat(Rice rice) {
//        this.weight += rice.getWeight();
//    }
//
//    public void eat(Beans beans) {
//        this.weight += beans.getWeight();
//    }
//
//    public void eat(IceCream iceCream) {
//        this.weight += iceCream.getWeight();
//    }
}
