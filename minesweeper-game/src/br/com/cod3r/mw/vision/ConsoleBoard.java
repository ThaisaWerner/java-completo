package br.com.cod3r.mw.vision;

import br.com.cod3r.mw.exception.ExitException;
import br.com.cod3r.mw.exception.ExplosionException;
import br.com.cod3r.mw.model.Board;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ConsoleBoard {

    private Board board;
    private Scanner scanner = new Scanner(System.in);

    public ConsoleBoard(Board board) {
        this.board = board;
        executeGame();
    }

    private void executeGame() {
        try {
            boolean continueGame = true;

            while(continueGame) {
                gameLoop();

                System.out.println("Another game? (Y/n) ");
                String answer = scanner.nextLine();

                if("n".equalsIgnoreCase(answer)) {
                    continueGame = false;
                } else {
                    board.restart();
                }
            }
        } catch(ExitException e) {
            System.out.println("Bye!");
        } finally {
            scanner.close();
        }

    }

    private void gameLoop() {
        try {

            while(!board.objectiveAchieved()) {
                System.out.println(board);

                String input = getInput("Enter (x, y): ");

                Iterator<Integer> xy = Arrays.stream(input.split(","))
                        .map(i -> Integer.parseInt(i.trim())).iterator();

                input = getInput("Enter 1 to open or 2 to mark or unmark: ");

                if("1".equals(input)) {
                    board.open(xy.next(), xy.next());
                } else if ("2".equals(input)) {
                    board.rotateTag(xy.next(), xy.next());
                }
            }

            System.out.println(board);
            System.out.println("You win!");
        } catch (ExplosionException e) {
            System.out.println(board);
            System.out.println("You lost!");
        }
    }

    private String getInput(String text) {
        System.out.println(text);
        String input = scanner.nextLine();

        if("exit".equalsIgnoreCase(input)) {
            throw new ExitException();
        }

        return input;
    }


}
