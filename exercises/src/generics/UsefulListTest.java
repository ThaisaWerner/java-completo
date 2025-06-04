package generics;

import java.util.Arrays;
import java.util.List;

public class UsefulListTest {
    public static void main(String[] args) {

        //Without using generics we need to cast
        List<String> languages = Arrays.asList("Java", "Python", "C++", "JavaScript");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        String lastLanguage1 = (String) UsefulList.getLast1(languages);
        System.out.println("Last language: " + lastLanguage1);

        Integer lastNumber1 = (Integer) UsefulList.getLast1(numbers);
        System.out.println("Last number: " + lastNumber1);

        //Using generics we don't need to cast
        String lastLanguage2 = UsefulList.getLast2(languages);
        System.out.println("Last language: " + lastLanguage2);

        Integer lastNumber2 = UsefulList.<Integer>getLast2(numbers);
        System.out.println("Last number: " + lastNumber2);
    }
}
