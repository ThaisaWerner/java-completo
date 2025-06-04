package oo.heritage.test;

import oo.heritage.challenge.Car;
import oo.heritage.challenge.Civic;
import oo.heritage.challenge.Ferrari;

public class CarTest {
    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari(400);
        Car civic = new Civic();

        System.out.println("Ferrari: " + ferrari.currentSpeed);
        System.out.println("Civic: " + civic.currentSpeed);

        ferrari.turnOnTurbo();
        ferrari.turnOnAir();
        ferrari.turnOffAir();

        ferrari.accelerate();
        ferrari.accelerate();
        ferrari.accelerate();
        ferrari.brake();

        civic.accelerate();
        civic.accelerate();
        civic.accelerate();

        System.out.println("Ferrari: " + ferrari.currentSpeed);
        System.out.println("Civic: " + civic.currentSpeed);

        ferrari.brake();
        civic.brake();

        System.out.println("Ferrari: " + ferrari.currentSpeed);
        System.out.println("Civic: " + civic.currentSpeed);
    }
}
