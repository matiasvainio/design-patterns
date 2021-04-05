package state;

public class Main {
    private static final int LOOPS = 12;

    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();

        for (int i = 0; i < LOOPS; i++) {
            pokemon.doStuff();
        }
    }
}
