package visitor;

import visitor.character.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BonusVisitor bonusVisitor = new BonusVisitorImpl();
        List<GameCharacter> characters = Arrays.asList(
                new GameCharacter(new BeginnerCharacter()),
                new GameCharacter(new NoviceCharacter()),
                new GameCharacter(new ExpertCharacter())
        );

        TUI tui = new TUI(characters, bonusVisitor);
        tui.start();
    }

}
