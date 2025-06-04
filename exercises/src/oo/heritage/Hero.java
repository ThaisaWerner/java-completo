package oo.heritage;

public class Hero extends Player {
    // Hero class inherits from Player class
    // It can have its own attributes and methods, but it also has all the attributes and methods of Player
    // This is called inheritance
    // Inheritance is a way to create a new class that is based on an existing class
    // The new class is called a subclass or child class
    // The existing class is called a superclass or parent class

    //Overwriting the attack method so the Hero can have more attack power
//    boolean attack(Player opponent) {
//        int deltaX = Math.abs(x - opponent.x);
//        int deltaY = Math.abs(y - opponent.y);
//
//        if(deltaX == 0 && deltaY == 1) {
//            opponent.life -= 20;
//            return true;
//        } else if(deltaX == 1 && deltaY ==0) {
//            opponent.life -= 20;
//            return true;
//        } else {
//            return false;
//        }
//    }

    //Or I can do:
    //Super is the superclass of the Hero class = Player
    public boolean attack(Player opponent) {
        boolean attack1 = super.attack(opponent);
        boolean attack2 = super.attack(opponent);
        return attack1 || attack2;
    }
}
