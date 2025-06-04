package oo.heritage.challenge;

public class Car {
    public int currentSpeed;
    int MAX_SPEED;
    private int delta = 5;

    //When we don't have the default constructor, we need to create a constructor in the son's class (Ferrari & Civic)
    Car(int maxSpeed) {
        maxSpeed = MAX_SPEED;
    }

    public void accelerate() {
        if(currentSpeed + getDelta() > MAX_SPEED){
            currentSpeed = MAX_SPEED;
        } else {
            currentSpeed += getDelta();
        }
    }

    public void brake() {
        if(currentSpeed >= 5) {
            currentSpeed -= 5;
        } else {
            currentSpeed = 0;
            System.out.println("Car is already stopped");
        }
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
