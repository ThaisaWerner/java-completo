package oo.encapsulation;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person(-45);
        person.setAge(230);

        System.out.println(person.getAge());

    }
}
