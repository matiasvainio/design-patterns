package command;

public class WallButton {
    private Command command;

    public WallButton(Command command) {
        this.command = command;
    }

    public void push() {
        command.execute();
    }
}
