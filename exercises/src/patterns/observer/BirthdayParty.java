package patterns.observer;

public class BirthdayParty {
    public static void main(String[] args) {

        Girlfriend girlfriend = new Girlfriend();
        Doorman doorman = new Doorman();

        doorman.registerObservers(girlfriend);
        doorman.monitor();
    }
}
