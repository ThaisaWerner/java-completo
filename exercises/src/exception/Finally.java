package exception;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print(7 / scanner.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally { //Finally code will always be executed, when try or catch block is executed
            System.out.println("Finally....");
            scanner.close();
        }

        //The finally block is executed even if there is no exception
        try {
            System.out.print(7 / scanner.nextInt());
        } finally { //Finally code will always be executed, when try or catch block is executed
            System.out.println("Finally....");
            scanner.close();
        }

        System.out.println("End");
    }
}
