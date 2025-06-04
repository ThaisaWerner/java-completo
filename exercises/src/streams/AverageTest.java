package streams;

public class AverageTest {
    public static void main(String[] args) {

        Average av1 = new Average().add(8.3).add(6.7);
        Average av2 = new Average().add(7.9).add(6.6);

        System.out.println(av1.getValue());
        System.out.println(av2.getValue());

        System.out.println(Average.combine(av1, av2).getValue());
    }
}
