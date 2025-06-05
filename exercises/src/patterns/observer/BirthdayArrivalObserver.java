package patterns.observer;

@FunctionalInterface
public interface BirthdayArrivalObserver {

    public void arrived(BirthdayArrivalEvent event);
}
