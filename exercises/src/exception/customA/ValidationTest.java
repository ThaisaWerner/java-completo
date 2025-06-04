package exception.customA;

import exception.Student;

public class ValidationTest {
    public static void main(String[] args) {

        try {
            Student student = new Student("Ana", 7);
            Validate.student(student);

            Validate.student(null);
        } catch (EmptyStringException | NumberOutOfRangeException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End");
    }

}
