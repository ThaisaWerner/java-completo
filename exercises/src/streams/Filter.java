package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {

        Student student1 = new Student("Ana", 7.8);
        Student student2 = new Student("Bia", 5.8);
        Student student3 = new Student("Daniel", 9.8);
        Student student4 = new Student("Gui", 6.8);
        Student student5 = new Student("Rebeca", 7.1);
        Student student6 = new Student("Pedro", 8.8);

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6);

        Predicate<Student> approved = s -> s.grade >= 7;
        Function<Student, String> salutation = s -> "Congratulations " + s.name + "! You have been approved";

        students.stream()
                .filter(approved)
                .map(salutation)
                .forEach(System.out::println);
    }
}
