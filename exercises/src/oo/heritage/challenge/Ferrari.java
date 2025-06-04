package oo.heritage.challenge;

public class Ferrari extends Car implements Sporty, Luxury {

    private boolean turnOnTurbo = false;
    private boolean turnOnAir = false;

    public Ferrari() {
        super(315);
    }

    public Ferrari(int maxSpeed) {
        super(maxSpeed);
        setDelta(15);
    }

    @Override
    public void turnOnTurbo() {
        turnOnTurbo = true;
    }

    @Override
    public void turnOffTurbo() {
        turnOnTurbo = false;
    }

    @Override
    public void turnOnAir() {
        turnOnAir = true;
    }

    @Override
    public void turnOffAir() {
        turnOnAir = false;
    }

    @Override
    public int getDelta() {
        if(turnOnTurbo && !turnOnAir) {
            return 35;
        } else if(turnOnTurbo && turnOnAir) {
            return 30;
        } else if(!turnOnTurbo && !turnOnAir) {
            return 20;
        } else {
            return 15;
        }
    }

//    @Override
//    public void accelerate() {
//        currentSpeed += 15;
//    }
//
//    @Override
//    public void brake() {
//        currentSpeed -= 15;
//    }
}
