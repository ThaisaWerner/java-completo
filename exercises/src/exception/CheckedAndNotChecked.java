package exception;

public class CheckedAndNotChecked {
    public static void main(String[] args) {

        try {
            generateError1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            generateError2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End");
    }

    //Unchecked or not verified - I choose if I want to catch it or not
    //RuntimeException and its subclasses are unchecked exceptions
    static void generateError1() {
        throw new RuntimeException("An error ocurred #01");
    }

    //Checked exception - I have to catch it or declare it in the method signature
    //All the other exceptions are checked exceptions

    //like this then I have to catch the method call (line 12) or put it in the method signature of the method call
    //and deal with it afterward

    static void generateError2() throws Exception {
        throw new Exception("An error ocurred #02");
        }

    // or

//    static void generateError2() {
//        try {
//            throw new Exception("An error ocurred #02");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
}
