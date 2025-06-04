package generics;

public class BoxIntTest {
    public static void main(String[] args) {

        BoxInt boxA = new BoxInt();
        boxA.keep(123);

        Integer thing = boxA.open();
        System.out.println(thing);
    }
}
