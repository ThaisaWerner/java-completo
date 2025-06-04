package classy;

public class DataChallenge {
    //3 attributes - day, month e year, then create another class and instantiate it creating 2 dates
    //method to print the date in the right format
    //make two constructors, one with no parameters and another with parameters
    //the constructor without parameters have to return the date 01/01/1970

    static int day; //class attribute
    int month; //instance attribute
    int year;

    public DataChallenge () {
        this(1, 1, 1970);
    }

    public DataChallenge (int day, int month, int year) {
        DataChallenge.day = day;
        this.month = month;
        this.year = year;
    }

    String formatedData () {
        return String.format("%d/%d/%d", day, month, year);
    }
}
