package state;

public class Charmeleon implements EvolutionState {
    private int count;

    @Override
    public String attack(Pokemon context) {
        count++;
        if (count >= 3) {
            context.setState(new Charizard());
        }
        return "EMBER!";
    }

    @Override
    public String makeNoise() {
        return "*murmur*";
    }

    @Override
    public String getName() {
        return "Charmeleon";
    }
}
