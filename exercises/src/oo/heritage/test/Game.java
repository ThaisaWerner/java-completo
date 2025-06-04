package oo.heritage.test;

import oo.heritage.Hero;
import oo.heritage.Monster;

public class Game {
    public static void main(String[] args) {

        Monster player1 = new Monster();
        player1.x = 10;
        player1.y = 10;

        //Still works because Hero inherited from Player, so it has the same attributes and methods
        Hero player2 = new Hero();
        player2.x = 10;
        player2.y = 11;

        player1.attack(player2);
        player2.attack(player1);

        System.out.println(player1.life);
        System.out.println(player2.life);




// Enum class 154
//        Player player1 = new Player();
//        player1.x = 10;
//        player1.y = 10;
//
//        player1.walk(Direction.NORTH);
//        player1.walk(Direction.EAST);
//        player1.walk(Direction.NORTH);
//        player1.walk(Direction.EAST);
//
//        System.out.println(player1.y);
//        System.out.println(player1.x);
    }
}
