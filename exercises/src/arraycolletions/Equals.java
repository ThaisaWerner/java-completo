package arraycolletions;

public class Equals {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "John";
        user1.email = "john@gmail.com";

        User user2 = new User();
        user2.name = "John";
        user2.email = "john@gmail.com";

        System.out.println(user1.equals(user2));
    }
}
