package oo.composition;

public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println(car1.isRunning());

        car1.turnOn();
        System.out.println(car1.isRunning());

        System.out.println(car1.engine.spins());

        car1.accelerate();
        car1.accelerate();
        car1.accelerate();
        car1.accelerate();

        System.out.println(car1.engine.spins());

        car1.brake();
        car1.brake();
        car1.brake();
        car1.brake();

        System.out.println(car1.engine.spins());
    }
}
