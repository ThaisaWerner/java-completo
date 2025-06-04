package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {

        Student student1 = new Student("Ana", 7.1);
        Student student2 = new Student("Luna", 6.1);
        Student student3 = new Student("Gui", 8.1);
        Student student4 = new Student("Gabi", 10);

        List<Student> students = Arrays.asList(student1, student2, student3, student4);

        Comparator<Student> betterGrade = (s1, s2) -> {
            if (s1.grade > s2.grade) return 1;
            if (s1.grade < s2.grade) return -1;
            return 0;
        };

        System.out.println(students.stream()
                .max(betterGrade)
                .get());
        System.out.println(students.stream()
                .min(betterGrade)
                .get());
    }
}
