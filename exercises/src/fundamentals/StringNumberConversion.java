package fundamentals;

import javax.swing.*;

public class StringNumberConversion {

    public static void main(String[] args) {

// Of course a lot of problems can occur when converting a string to a number
        String value1 = JOptionPane.showInputDialog("Type the first number: ");
        String value2 = JOptionPane.showInputDialog("Type the second number: ");

        System.out.println(value1 + value2);

        double number1 = Double.parseDouble(value1);
        double number2 = Double.parseDouble(value2);

        double sum = number1 + number2;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + sum / 2);

// If you need a higher precision, use BigDecimal
    }
}
