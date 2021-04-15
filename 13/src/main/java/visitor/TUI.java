package visitor;

import visitor.character.GameCharacter;

import java.util.List;
import java.util.Scanner;

public class TUI {
    private final List<GameCharacter> characterList;
    private final BonusVisitor bonusVisitor;

    public TUI(List<GameCharacter> characterList, BonusVisitor bonusVisitor) {
        this.characterList = characterList;
        this.bonusVisitor = bonusVisitor;
    }

    public void start() {
        boolean ready = false;
        while (!ready) {
            ready = true;
            for (GameCharacter c : characterList) {
                c.accept(bonusVisitor);
                if (!c.getState().getClass().getSimpleName().equals("ExpertCharacter")) {
                    ready = false;
                }
            }
        }
    }
}
