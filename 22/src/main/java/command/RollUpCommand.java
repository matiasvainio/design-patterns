package command;

public class RollUpCommand implements Command {
    private final SilverScreen screen;

    public RollUpCommand(SilverScreen silverScreen) {
        this.screen = silverScreen;
    }

    @Override
    public void execute() {
        screen.rollUp();
    }
}
