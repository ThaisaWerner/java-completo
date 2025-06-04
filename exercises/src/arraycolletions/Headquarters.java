package arraycolletions;

import java.util.Arrays;
import java.util.Scanner;

public class Headquarters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many students?");
        int studentsQuantity = scanner.nextInt();

        System.out.println("How many tests per student?");
        int testsQuantity = scanner.nextInt();

        double[][] classScores = new double[studentsQuantity][testsQuantity];

        double total = 0.0;
        for(int i = 0; i < classScores.length; i++) {
            for(int j = 0; j < classScores[i].length; j++) {
                System.out.printf("Enter the score %d of student %d: ", j +1, i + 1);
                classScores[i][j] = scanner.nextDouble();

                total += classScores[i][j];
            }
        }

        double classAverage = total / (studentsQuantity * testsQuantity);
        System.out.println("The class average is: " + classAverage);

        for(double[] studentScores: classScores) {
            System.out.println(Arrays.toString(studentScores));
        }

        scanner.close();
    }
}
