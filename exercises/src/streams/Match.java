package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {

        Student student1 = new Student("Ana", 7.1);
        Student student2 = new Student("Luna", 6.1);
        Student student3 = new Student("Gui", 8.1);
        Student student4 = new Student("Gabi", 10);

        List<Student> students = Arrays.asList(student1, student2, student3, student4);

        Predicate<Student> approved = s -> s.grade >= 7;

        System.out.println(students.stream().allMatch(approved));
        System.out.println(students.stream().anyMatch(approved));
        System.out.println(students.stream().noneMatch(approved));
    }
}
