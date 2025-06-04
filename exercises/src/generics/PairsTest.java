package generics;

public class PairsTest {
    public static void main(String[] args) {

        Pairs<Integer, String> pair1 = new Pairs<>();

        pair1.add(1, "Maria");
        pair1.add(2, "Pedro");
        pair1.add(3, "Gui");
        pair1.add(4, "Ana");
        pair1.add(2, "Rebeca");

        System.out.println(pair1.getValue(1));
        System.out.println(pair1.getValue(4));
        System.out.println(pair1.getValue(2));
        System.out.println(pair1.getValue(5)); // This will return null since key 5 does not exist
    }
}
