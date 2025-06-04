package oo.polymorphism;

public class Dinner {
    public static void main(String[] args) {
//What is commented was my solution to implement polymorphism, that was different from the teacher's solution

        Person person = new Person(99.65);

        Rice ingredient1 = new Rice(0.2);
        //With abstract class I can't do this:
        //Food rice = new Food(0.2);
        Food ingredient2 = new Beans(0.1);
        //Food beans = new Food(0.1);

        System.out.println(person.getWeight());

        person.eat(ingredient1);
        //person.eat(rice);
        person.eat(ingredient2);
        //person.eat(beans);

        System.out.println(person.getWeight());

        IceCream dessert = new IceCream(0.4);

        person.eat(dessert);

        System.out.println(person.getWeight());
    }
}
