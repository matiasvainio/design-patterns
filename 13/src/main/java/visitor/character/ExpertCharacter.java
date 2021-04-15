package visitor.character;

import visitor.BonusVisitor;

public class ExpertCharacter implements CharacterState {
    private double points;

    public ExpertCharacter() {
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

    }

}
