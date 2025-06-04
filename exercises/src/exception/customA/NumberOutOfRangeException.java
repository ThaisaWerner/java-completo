package exception.customA;

public class NumberOutOfRangeException extends RuntimeException {

    private String attributeName;

    NumberOutOfRangeException(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getMessage() {
        return String.format("The attribute '%s' is out of range", attributeName);
    }

}
