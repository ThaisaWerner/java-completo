package generics;

import java.util.TreeSet;

public class ComparableTest {
    public static void main(String[] args) {

        //Integer is a class that implements Comparable interface, so that is why it works fine here.
        //Another types of TreeSet can be created using other classes that implement Comparable interface.
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(1);
        numbers.add(3);
        numbers.add(6);
        numbers.add(8);
        numbers.add(9);
        numbers.add(123);
        numbers.add(-13);

        for(Integer n : numbers) {
            System.out.println(n);
        }
    }
}
