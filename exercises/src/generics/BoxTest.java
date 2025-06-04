package generics;

public class BoxTest {
    public static void main(String[] args) {

        Box<String> boxA = new Box<>();
        boxA.keep("Hello Generics!");

        // No need to cast the result, because we specified the type in the Box class.
        String thing = boxA.open();
        System.out.println(thing);

        Box<Double> boxB = new Box<>();
        boxB.keep(3.14);

        Double thingB = boxB.open();
        System.out.println(thingB);
    }
}
