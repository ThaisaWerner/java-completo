package patterns.observer;

public class Girlfriend implements BirthdayArrivalObserver {

    public void arrived(BirthdayArrivalEvent event) {
        System.out.println("Notify the guests.");
        System.out.println("Turn off the lights.");
        System.out.println("Wait a moment.");
        System.out.println("Surprise!");
    }
}
