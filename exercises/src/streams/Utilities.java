package streams;

import java.util.function.UnaryOperator;

public class Utilities {

    public final static UnaryOperator<String> toUpperCase = n -> n.toUpperCase();
    public final static UnaryOperator<String> firstLetter = n -> n.charAt(0) + "";
    public final static String exclamation(String n) {
        return n + "!!!";
    }

}
