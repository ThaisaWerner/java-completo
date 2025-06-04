package control;

import java.util.Scanner;

public class IfWeekdayChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day of the week: ");
        String day = scanner.next();

        if(day.equals("Domingo") || day.equals("domingo")) {
            System.out.println("1");
        } else if(day.equalsIgnoreCase("Segunda")) {
            System.out.println("2");
        } else if(day.equalsIgnoreCase("Terça")) {
            System.out.println("3");
        } else if(day.equalsIgnoreCase("Quarta")) {
            System.out.println("4");
        } else if(day.equalsIgnoreCase("Quinta")) {
            System.out.println("5");
        } else if(day.equalsIgnoreCase("Sexta")) {
            System.out.println("6");
        } else if(day.equalsIgnoreCase("Sábado")) {
            System.out.println("7");
        } else {
            System.out.println("Invalid day of the week");
        }

        scanner.close();
    }
}
