package oo.composition;

public class Engine {

    final Car car;
    boolean start = false;
    double injectionFactor = 1;

    Engine (Car car) {
        this.car = car;
    }

    int spins () {
        if (!start) {
            return 0;
        } else {
            return (int) Math.round(injectionFactor * 3000);
        }
    }
}
