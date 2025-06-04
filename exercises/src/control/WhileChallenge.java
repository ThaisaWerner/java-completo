package control;

import java.util.Objects;
import java.util.Scanner;

public class WhileChallenge {
    /* Collect a valid grade, store ir in a variable and when a new grade is entered, add it to the variable, summing all grades.
    *  In another variable store how many valid grades were entered
    *  When the user enters -1, the program should stop and show the average of the valid grades
    *  If an invalid grade is entered, show an error message and continue asking for the grade
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double grade = 0;
        int counter = 0;
        double newGrade;

        do {
            System.out.println("Enter a grade: ");
            newGrade = scanner.nextDouble();

            if (newGrade >= 0 && newGrade <= 10) {
                grade += newGrade;
                counter++;
            } else if (newGrade == -1) {
                System.out.println("The average of the grades is: " + grade / counter);
            } else {
                System.out.println("Invalid grade. Please enter a grade between 0 and 10: ");
            }

        } while (newGrade != -1);

        scanner.close();
    }
}
