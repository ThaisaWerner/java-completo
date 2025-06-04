package arraycolletions;

import java.util.Objects;

public class User {

    String name;
    String email;

    public boolean equals(Object obj) {
        if(obj instanceof User) {
            User anotherUser = (User) obj; //Converting obj to User type

            boolean sameName = anotherUser.name.equals(this.name);
            boolean sameEmail = anotherUser.email.equals(this.email);

            return sameName && sameEmail;
        } else {
            return false;
        }
    }

}
