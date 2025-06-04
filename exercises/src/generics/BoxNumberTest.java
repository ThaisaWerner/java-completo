package generics;

public class BoxNumberTest {
    public static void main(String[] args) {

        BoxNumber<Double> boxA = new BoxNumber<>();
        boxA.keep(2.3);
        System.out.println(boxA.open());

        BoxNumber<Integer> boxB = new BoxNumber<>();
        boxB.keep(2);
        System.out.println(boxB.open());
    }
}
