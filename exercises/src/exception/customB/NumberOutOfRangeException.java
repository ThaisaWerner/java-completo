package exception.customB;

public class NumberOutOfRangeException extends Exception {

    private String attributeName;

    NumberOutOfRangeException(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getMessage() {
        return String.format("The attribute '%s' is out of range", attributeName);
    }

}
