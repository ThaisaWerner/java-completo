package fundamentals;

public class LogicalOperatorsChallenge {

    public static void main(String[] args) {

        boolean tuesdayWork = true;
        boolean thursdayWork = false;

        if(tuesdayWork && thursdayWork) {
            System.out.println("Let's buy a 50' TV and get some ice cream!");
        } else if(tuesdayWork ^ thursdayWork) {
            System.out.println("Let's buy a 32' TV and get some ice cream!");
        } else {
            System.out.println("Let's save money and stay at home!");
        }

    }
}
