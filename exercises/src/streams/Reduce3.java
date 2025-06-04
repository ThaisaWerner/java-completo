package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
    public static void main(String[] args) {

        Student student1 = new Student("Ana", 7.1);
        Student student2 = new Student("Luna", 6.1);
        Student student3 = new Student("Gui", 8.1);
        Student student4 = new Student("Gabi", 10);

        List<Student> students = Arrays.asList(student1, student2, student3, student4);

        Predicate<Student> approved = s -> s.grade >= 7;
        Function<Student, Double> gradeOnly = s -> s.grade;
        BiFunction<Average, Double, Average> calculateAverage = (average, grade) -> average.add(grade);
        BinaryOperator<Average> combineAverages = (a1, a2) -> Average.combine(a1, a2);

        Average average = students.stream()
                .filter(approved)
                .map(gradeOnly)
                .reduce(new Average(), calculateAverage, combineAverages);

        System.out.println(average.getValue());
    }
}
