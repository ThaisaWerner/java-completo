package classy;

public class Person {

    String personName;
    double personWeight;

    Person (String personName, double personWeight) {
        this.personName = personName;
        this.personWeight = personWeight;
    }

    public void eat(Food food) {
        personWeight += food.foodWeight;
    }
}
