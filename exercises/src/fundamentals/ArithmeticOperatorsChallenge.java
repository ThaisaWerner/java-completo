package fundamentals;

public class ArithmeticOperatorsChallenge {

    public static void main(String[] args) {

        double firstParentheses = 6 * (3 + 2);
        double firstPotential = Math.pow(firstParentheses, 2);
        //I could have done this in one line:
        //double firstPotential = Math.pow(6 * (3 + 2), 2);
        double firstDivision = firstPotential / (3 * 2);

        double secondParentheses = (1 - 5) * (2 - 7);
        double secondDivision = secondParentheses / 2;
        double secondPotential = Math.pow(secondDivision, 2);

        double subtraction = firstDivision - secondPotential;

        double result = Math.pow(subtraction, 3) / Math.pow(10, 3);
        System.out.println(result);

    }
}
