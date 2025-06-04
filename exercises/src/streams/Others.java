package streams;

import java.util.Arrays;
import java.util.List;

public class Others {
    public static void main(String[] args) {
        Student student1 = new Student("Ana", 7.1);
        Student student2 = new Student("Luna", 6.1);
        Student student3 = new Student("Gui", 8.1);
        Student student4 = new Student("Gabi", 10);
        Student student5 = new Student("Ana", 7.1);
        Student student6 = new Student("Pedro", 6.1);
        Student student7 = new Student("Gui", 8.1);
        Student student8= new Student("Maria", 10);

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6, student7, student8);

        System.out.println("Distinct...");
        students.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip | Limit");
        students.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\nTakeWhile");
        students.stream()
                .distinct()
                .takeWhile(s -> s.grade >= 7)
                .forEach(System.out::println);

    }
}
