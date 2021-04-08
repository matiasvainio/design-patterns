package templateMethod;

import java.util.Scanner;

public class RPS extends Game {
    private final String[] a = {"PAPER", "SCISSORS", "ROCK"};
    private int MAX_TURNS;
    private int[] players;
    private int turns;
    private boolean end;
    private Scanner scanner;

    @Override
    void initializeGame() {
        MAX_TURNS = 2;
        players = new int[2];
        turns = 0;
        end = false;
        scanner = new Scanner(System.in);
    }

    @Override
    void makePlay(int player) {
        if (turns < MAX_TURNS) {
            int i = getRandom();
            if (player == 0) {
                System.out.println("Syötä luku (0-2):");
                int input = Integer.parseInt(scanner.nextLine());
                players[player] = input;
                System.out.println("P" + player + ": " + a[input]);
            } else {
                System.out.println("P" + player + ": " + a[i]);
                players[player] = i;
            }
        } else {
            end = true;
        }
        turns++;

    }

    @Override
    boolean endOfGame() {
        return end;
    }

    @Override
    void printWinner() {
        int w = calculateWinner();
        int q = (w == players[0]) ? 0 : 1;
        if (w == 3) System.out.println("Draw");
        else {
            System.out.println("Winner: \nP" + q + " with: " + a[w]);
        }
    }

    private int getRandom() {
        return (int) (Math.random() * 3);
    }

    private int calculateWinner() {
        int w;

        if (players[0] == players[1]) {
            w = 3;
        } else if (players[0] == 0 | players[1] == 0 && players[0] == 2 | players[1] == 2) {
            w = 0;
        } else {
            w = Math.max(players[0], players[1]);
        }

        return w;
    }
}
