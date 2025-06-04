package arraycolletions;

import java.util.Objects;

public class UserList {

    String name;

    public UserList(String name) {
        this.name = name;
    }

    public String toString() {
        return "My name is " + this.name;
    }

    @Override
    public boolean equals(Object o) {
        User anotherUser = (User) o; //Converting obj to User type
        return this.name.equals(anotherUser.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
