package command;

public class RollDownCommand implements Command {
    private final SilverScreen screen;

    public RollDownCommand(SilverScreen silverScreen) {
        this.screen = silverScreen;
    }

    @Override
    public void execute() {
        screen.rollDown();
    }
}
