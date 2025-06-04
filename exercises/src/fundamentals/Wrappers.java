package fundamentals;

import java.util.Scanner;

public class Wrappers {

    //Object-oriented for primitive types

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Byte b = 100;
        Short s = 1000;
        //transforming a string in a integer
        Integer i = Integer.parseInt("10000");
        //getting the value true a scanner and transforming it in a integer
        Integer in = Integer.parseInt(input.nextLine());
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(in * 3);

        Float f = 123.10F;
        Double d = 1234.5678;
        //transforming a string in a boolean
        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);

        Character c = '#';
        System.out.println(c + "...");

        input.close();
    }
}
