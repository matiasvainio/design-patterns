package visitor.character;

import visitor.BonusVisitor;

public class NoviceCharacter implements CharacterState {
    private double points;

    public NoviceCharacter() {
        this.points = 0;
    }

    @Override
    public void accept(BonusVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public double getPoints() {
        return points;
    }

    @Override
    public void setPoints(double points) {
        this.points += points;
    }

    @Override
    public void checkPoints(GameCharacter state) {
        if (points > 50) {
            state.setState(new ExpertCharacter());
        }
    }
}
