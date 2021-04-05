package state;

public class Charizard implements EvolutionState {

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
