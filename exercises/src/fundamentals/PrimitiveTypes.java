package fundamentals;

public class PrimitiveTypes {

    public static void main(String[] args) {

        //integer numeric types
        byte yearsOfCompany = 23;
        short flightsNumber = 542;
        int id = 56789;
        long points = 3_134_845_223L;

        //real numeric types
        float salary = 11_445.44F; //F because Java understand this number as a double because of the decimal point, so the F says that this number is a float
        double sales = 2_991_797_103.01;

        //boolean type
        boolean isOnVacation = false; // or true

        //character type
        char status = 'A'; //single quotes with anything inside since it's a single character

        System.out.println("Years of Company: " + yearsOfCompany * 365);

        System.out.println("Number of trips: " + flightsNumber / 2);

        System.out.println("Points per real: " + points / sales);

        System.out.println("Id " + id + " -> Salary " + salary);

        System.out.println("Is on vacation? " + isOnVacation);

        System.out.println("Status: " + status);
    }
}
