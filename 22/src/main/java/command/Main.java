package command;

public class Main {

    public static void main(String[] args) {
        SilverScreen screen = new SilverScreen();
        Command switchUp = new RollUpCommand(screen);
        Command switchDown = new RollDownCommand(screen);
        WallButton downButton = new WallButton(switchDown);
        WallButton upButton = new WallButton(switchUp);

        downButton.push();
        upButton.push();
    }
}
