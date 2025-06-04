package classy;

public class DataChallengeTest {

    public static void main(String[] args) {

        DataChallenge data1 = new DataChallenge();

        DataChallenge data2 = new DataChallenge(15, 6, 2022);

        System.out.println(data1.formatedData() + "\n");
        System.out.println(data2.formatedData());
    }
}
