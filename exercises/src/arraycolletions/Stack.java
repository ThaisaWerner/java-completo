package arraycolletions;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {
    public static void main(String[] args) {

        Deque<String> books = new ArrayDeque<>();

        books.add("The little prince"); //Returns true or false if added successfully
        books.push("Don Quixote"); //Returns an exception if the stack is full
        books.push("The Hobbit");

        System.out.println(books.peek()); //Returns the next last element of the stack. When the stack is empty, it returns null
        System.out.println(books.element()); //Returns the next last element of the stack. When the stack is empty, it throws an exception

        System.out.println(books.poll()); //Returns and removes the next last element of the stack. When the stack is empty, it returns null
        System.out.println(books.pop()); //Returns and removes the next last element of the stack. When the stack is empty, it throws an exception
        System.out.println(books.remove()); //Returns and removes the next last element of the stack. When the stack is empty, it throws an exception

        //books.size();
        //books.clear();
        //books.contains("The Hobbit");
    }
}
