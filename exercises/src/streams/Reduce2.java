package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {

        Student student1 = new Student("Ana", 7.1);
        Student student2 = new Student("Luna", 6.1);
        Student student3 = new Student("Gui", 8.1);
        Student student4 = new Student("Gabi", 10);

        List<Student> students = Arrays.asList(student1, student2, student3, student4);

        Predicate<Student> approved = s -> s.grade >= 7;
        Function<Student, Double> grade = s -> s.grade;
        BinaryOperator<Double> sum = (ac, n) -> ac + n;

        students.stream()
                .filter(approved)
                .map(grade)
                .reduce(sum)
                .ifPresent(System.out::println);
    }
}
