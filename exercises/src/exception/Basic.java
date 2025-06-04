package exception;

import java.sql.SQLOutput;

public class Basic {
    public static void main(String[] args) {

        Student student = null;

        try {
            printStudent(student);
        } catch (Exception exception) {
            System.out.println("An erro ocurred when tried to print the user");
        }

        try {
            System.out.println(7/0);
        } catch (ArithmeticException e) {
            System.out.println("An error ocurred: " + e.getMessage());
        }
    }

    public static void printStudent(Student student){
        System.out.println(student.name);
    }
}
