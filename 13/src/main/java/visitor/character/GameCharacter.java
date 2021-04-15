package visitor.character;

import visitor.BonusVisitor;

import java.util.List;

public class GameCharacter {
    private CharacterState state;

    public GameCharacter(CharacterState state) {
        this.state = state;
    }

    public void setState(CharacterState state) {
        this.state = state;
    }

    public CharacterState getState() {
        return state;
    }

    public void accept(BonusVisitor visitor) {
        state.checkPoints(this);
        state.accept(visitor);
    }
}
