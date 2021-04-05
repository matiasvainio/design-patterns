package state;

public class Pokemon {
    private EvolutionState state;

    public Pokemon() {
        this.state = new Charmander();
    }

    public void setState(EvolutionState state) {
        this.state = state;
    }

    public void doStuff() {
        System.out.println(this.state.getName());
        System.out.println(this.state.makeNoise());
        System.out.println(this.state.attack(this));
        System.out.println();
    }
}
