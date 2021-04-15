package visitor;

import visitor.character.*;

public interface BonusVisitor {

    void visit(BeginnerCharacter character);

    void visit(NoviceCharacter character);

    void visit(ExpertCharacter character);

}
