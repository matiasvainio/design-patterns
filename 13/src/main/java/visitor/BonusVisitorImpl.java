package visitor;

import visitor.character.BeginnerCharacter;
import visitor.character.ExpertCharacter;
import visitor.character.NoviceCharacter;

public class BonusVisitorImpl implements BonusVisitor {
    private final double POINTS = 10;

    @Override
    public void visit(BeginnerCharacter character) {
        character.setPoints(
                POINTS + 2
        );
        System.out.println(character.getClass().getSimpleName());
        System.out.println(character.getPoints());
    }

    @Override
    public void visit(NoviceCharacter character) {
        character.setPoints(
                POINTS * 0.8 + 1
        );
        System.out.println(character.getClass().getSimpleName());
        System.out.println(character.getPoints());
    }

    @Override
    public void visit(ExpertCharacter character) {
        character.setPoints(
                POINTS * 0.5 + 0.5
        );
        System.out.println(character.getClass().getSimpleName());
        System.out.println(character.getPoints());
    }

}
