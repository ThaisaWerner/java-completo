package arraycolletions;

import java.util.HashMap;
import java.util.Map;

public class Mapy {
    public static void main(String[] args) {

        Map<Integer, String> users = new HashMap<>();
        //Adds if doesn't exist and updates or substitute if exists
        users.put(1, "Roberto");
        users.put(2, "Ricardo");
        users.put(3, "Rafaela");
        users.put(4, "Rebeca");

        System.out.println(users.size());
        System.out.println(users.isEmpty());

        System.out.println(users.keySet()); //Returns the keys
        System.out.println(users.values()); //Returns the values
        System.out.println(users.entrySet()); //Returns the key-value pair

        System.out.println(users.containsKey(2));
        System.out.println(users.containsValue("Rebeca"));

        System.out.println(users.get(3)); //Returns the value of the key 3 = Rafaela
        System.out.println(users.remove(1));
        System.out.println(users.remove(4, "Gui"));

        //Scrolling through the key
        for(int key: users.keySet()) {
            System.out.println(key);
        }

        //Scrolling through the value
        for(String value: users.values()) {
            System.out.println(value);
        }

        //Scrolling through the key-value pair
        for(Map.Entry<Integer, String> register: users.entrySet()) {
            System.out.print(register.getKey() + " ==> ");
            System.out.println(register.getValue());
        }
    }
}
