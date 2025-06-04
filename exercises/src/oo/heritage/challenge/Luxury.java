package oo.heritage.challenge;

public interface Luxury {

    void turnOnAir();
    void turnOffAir();

    //Interfaces can hava default methods that are not obliged to be implemented
    default int airVelocity() {
        return 1;
    }
}
