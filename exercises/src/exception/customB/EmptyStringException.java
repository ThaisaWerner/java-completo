package exception.customB;

public class EmptyStringException extends Exception {

    private String attributeName;

    EmptyStringException(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getMessage() {
        return String.format("The attribute '%s' is empty", attributeName);
    }

}
