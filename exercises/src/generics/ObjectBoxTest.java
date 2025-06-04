package generics;

public class ObjectBoxTest {
    public static void main(String[] args) {
        ObjectBox boxA = new ObjectBox();
        boxA.keep(2.3);

        // We have to cast the result to Double because we use Object, that is too generic, in the ObjectBox class.
        //Generics help us avoid this, because we can tell the compiler what type we want to use
        Double thing = (Double) boxA.open();
        System.out.println(thing);
    }
}
