package arraycolletions;

import java.util.Scanner;

public class ArrayChallenge {
    //Calculate a student's average score. The student informs how many tests he took and the scores of each test.
    //Divide it in two for loops, one to take the scores and other to calculate it.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many tests did you take?");
        int testsQuantity = scanner.nextInt();
        double[] scores = new double[testsQuantity];

        for(int i = 0; i < scores.length; i++) {
            System.out.println("Enter the score " + (i +1) + ": ");
            scores[i] = scanner.nextDouble();
        }

        double total = 0.0;
        for(double score: scores) {
            total += score;
        }

        double average = total / scores.length;

        System.out.println("The average is: " + average);

        scanner.close();
    }
}
