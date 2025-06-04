package fundamentals;

import java.util.Scanner;

public class CalculatorChallenge {
    //Take from users terminal input two numbers and an operator and perform the operation
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.println("Please, enter the second number: ");
        double number2 = scanner.nextDouble();

        System.out.println("Please, enter the operator: ");
        String operator = scanner.next();

        double result = operator.equals("+") ? number1 + number2 : operator.equals("-") ? number1 - number2 :
                operator.equals("*") ? number1 * number2 : operator.equals("/") ? number1 / number2 :
                        operator.equals("%") ? number1 % number2 : Double.parseDouble("Invalid operator");

        /* I could have done like this:
        double result = operator.equals("+") ? number1 + number2 : 0;
        result = operator.equals("-") ? number1 - number2 : result;
        result = operator.equals("*") ? number1 * number2 : result;
        result = operator.equals("/") ? number1 / number2 : result;
        result = operator.equals("%") ? number1 % number2 : result;
        */

        System.out.println("The result is: " + result);

        scanner.close();

    }

}
