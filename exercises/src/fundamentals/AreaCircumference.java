package fundamentals;

public class AreaCircumference {

    public static void main(String[] args) {
        //variable
        double radius = 3.4;
        //constant, usually written in uppercase
        final double PI = 3.14159;

        //if you want to change the value of pi, you can't do it because it's a constant, and we will get an error
        //PI = 1;

        double area = PI * radius * radius;

        System.out.println(area);

        radius = 10;
        area = PI * radius * radius;
        System.out.println("Area = "+ area);
    }
}
