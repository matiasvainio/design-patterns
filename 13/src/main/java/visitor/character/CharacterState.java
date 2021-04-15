package visitor.character;

import visitor.BonusVisitor;

public interface CharacterState {

    void accept(BonusVisitor visitor);

    void setPoints(double points);

    double getPoints();

    void checkPoints(GameCharacter state);

}
