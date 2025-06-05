package patterns.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//Represents the subject in the Observer pattern
public class Doorman {

    private List<BirthdayArrivalObserver> observers = new ArrayList<>();

    public void registerObservers(BirthdayArrivalObserver observer) {
        observers.add(observer);
    }

    public void monitor() {
        Scanner scanner = new Scanner(System.in);

        String value = "";
        while(!"exit".equalsIgnoreCase(value)) {
            System.out.println("Birthday arrived? ");
            value = scanner.nextLine();

            if("yes".equalsIgnoreCase(value)) {
                //Create a new event
                BirthdayArrivalEvent event = new BirthdayArrivalEvent(new Date());
                //Notify all observers
                observers.stream()
                        .forEach(observer -> observer.arrived(event));
                value = "exit"; // Exit the loop after notifying
            } else {
                System.out.println("False alarm!");
            }
        }

        scanner.close();
    }

}
