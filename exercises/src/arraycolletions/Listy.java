package arraycolletions;

import java.util.ArrayList;
import java.util.List;

public class Listy {
    public static void main(String[] args) {

        UserList user = new UserList("Ana");
        List<String> list = new ArrayList<>();
        ArrayList<UserList> users = new ArrayList<>();

        UserList user1 = new UserList("Ana");
        users.add(user1);
        users.add(new UserList("Carlos"));
        users.add(new UserList("Lia"));
        users.add(new UserList("Bia"));
        users.add(new UserList("Manu"));
        users.add(new UserList("Manu"));

        //To return the correct value of the object, it is necessary to override the toString method in the UserList class
        System.out.println(users.get(3)); //Can access by index

        users.remove(1);
        users.remove(new UserList("Manu"));

        System.out.println(users.contains(new UserList("Lia")));

        for(UserList u: users) {
            System.out.println(u.name);
        }
    }
}
