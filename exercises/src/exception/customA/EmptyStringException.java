package exception.customA;

public class EmptyStringException extends RuntimeException {

    private String attributeName;

    EmptyStringException(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getMessage() {
        return String.format("The attribute '%s' is empty", attributeName);
    }

}
