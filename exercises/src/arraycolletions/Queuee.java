package arraycolletions;

import java.util.LinkedList;
import java.util.Queue;

public class Queuee {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        //The difference between add and offer is their behavior when the queue is full
        queue.add("Ana"); //Returns false if the queue is full
        queue.offer("Bia"); //Throws an exception if the queue is full
        queue.offer("Carlos");
        queue.offer("Daniel");
        queue.offer("Rafaela");
        queue.offer("Gui");

        //Returns the next element of the queue. The difference between remove and poll is their behavior when the queue is empty
        System.out.println(queue.peek()); // When the queue is empty, it returns null
        System.out.println(queue.element()); //When the queue is empty, it throws an exception

        //queue.size();
        //queue.clear();
        //queue.isEmpty();
        //queue.contains("Carlos");

        //Return and remove the next element of the queue. The difference between poll and remove is their behavior when the queue is empty
        System.out.println(queue.poll()); //When the queue is empty, it returns null
        System.out.println(queue.remove()); //When the queue is empty, it throws an exception
    }
}
