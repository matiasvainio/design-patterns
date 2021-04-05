package state;

public class Charizard implements EvolutionState {
    private int count;

    @Override
    public String attack(Pokemon context) {
        return "FLAMETHROWER!";
    }

    @Override
    public String makeNoise() {
        return "*ROAR*";
    }

    @Override
    public String getName() {
        return "Charizard";
    }
}
