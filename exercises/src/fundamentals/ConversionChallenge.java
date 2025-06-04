package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class ConversionChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    /* Here I could have used the replace method to replace the comma with a dot
        String firstSalary = scanner.nextLine().replace(",", ".");
    */
        System.out.println("Please, type the last three salaries.");
        System.out.print("First salary: ");
        String firstSalary = scanner.nextLine();
        System.out.print("Second salary: ");
        String secondSalary = scanner.nextLine();
        System.out.print("Third salary: ");
        String thirdSalary = scanner.nextLine();

        double firstSalaryDouble;
        double secondSalaryDouble;
        double thirdSalaryDouble;

        if (firstSalary.contains(",") || secondSalary.contains(",") || thirdSalary.contains(",")) {

            firstSalary = firstSalary.replace(",", ".");
            firstSalaryDouble = Double.parseDouble(firstSalary);

            secondSalary = secondSalary.replace(",", ".");
            secondSalaryDouble = Double.parseDouble(secondSalary);

            thirdSalary = thirdSalary.replace(",", ".");
            thirdSalaryDouble = Double.parseDouble(thirdSalary);

        } else {

            firstSalaryDouble = Double.parseDouble(firstSalary);
            secondSalaryDouble = Double.parseDouble(secondSalary);
            thirdSalaryDouble = Double.parseDouble(thirdSalary);

        }

        double salaryAverage = (firstSalaryDouble + secondSalaryDouble + thirdSalaryDouble) / 3;

        System.out.println(salaryAverage);

        scanner.close();
    }
}
