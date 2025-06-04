package classy;

public class Dinner {
    public static void main(String[] args) {

        Person person = new Person("Giovana", 50.0);
        Food rice = new Food("Rice", 0.100);
        Food beans = new Food("Beans", 0.200);

        person.eat(rice);
        person.eat(beans);

        System.out.println(person.personName + " ate " + rice.foodName + " and " + beans.foodName + " and now weighs " + person.personWeight + " kg.");
    }
}
