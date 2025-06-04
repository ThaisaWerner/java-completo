package oo.abstracty;

public class AbstractTest {
    public static void main(String[] args) {
        Mammal dog = new Dog();
        //or
        Animal dog2 = new Dog();

        System.out.println(dog.move());
        System.out.println(dog.feed());
        System.out.println(dog2.breathe());

        //Dog 2 doesn't have feed because was created by Animal
        System.out.println(dog2.move());
        System.out.println(dog2.breathe());
    }
}
