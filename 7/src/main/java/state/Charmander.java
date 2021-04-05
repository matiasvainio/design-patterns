package state;

public class Charmander implements EvolutionState {
    private int count;

    @Override
    public String attack(Pokemon context) {
        count++;
        if (count >= 3) {
            context.setState(new Charmeleon());
        }
        return "SCRATCH!";
    }

    @Override
    public String makeNoise() {
        return "*squeak*";
    }

    @Override
    public String getName() {
        return "Charmander";
    }
}
