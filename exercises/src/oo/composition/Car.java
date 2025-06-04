package oo.composition;

public class Car {

    final Engine engine;

    Car() {
        this.engine = new Engine(this);
    }
    void accelerate() {
        if(engine.injectionFactor < 2.6) {
            engine.injectionFactor += 0.4;
        }
    }

    void brake() {
        if(engine.injectionFactor > 5) {
            engine.injectionFactor -= 0.4;
        }
    }

    void turnOn() {
        engine.start = true;
    }

    void turnOff() {
        engine.start = false;
    }

    boolean isRunning() {
        return engine.start;
    }
}
