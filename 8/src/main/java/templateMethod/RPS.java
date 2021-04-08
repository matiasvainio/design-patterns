package templateMethod;

public class RPS extends Game {
    private final int MAX_TURNS = 2;
    private final String[] a = {"PAPER", "SCISSORS", "ROCK"};
    private int turns, rounds, one, two = 0;
    private boolean end = false;
    private int[] t = new int[2];


    @Override
    void initializeGame() {
    }

    @Override
    void makePlay(int player) {
        if (turns < MAX_TURNS) {
            int i = getRandom();
            System.out.println("P" + player + ": " + a[i]);
            t[player] = i;
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
        if (w == 3) System.out.println("Draw");
        else System.out.println("Winner: \nP" + w + " with: " + a[w]);

    }

    private int getRandom() {
        return (int) (Math.random() * 3);
    }

    private int calculateWinner() {
        int w;

        if (t[0] == t[1]) {
            w = 3;
        } else if (t[0] == 0 || t[1] == 0) {
            w = Math.min(t[0], t[1]);
        } else {
            w = Math.max(t[0], t[1]);
        }

        return w;
    }
}
