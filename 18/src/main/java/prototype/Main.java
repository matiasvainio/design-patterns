package prototype;

public class Main {

    public static void main(String[] args) {
        TUI tui = new TUI();
        Clock clock = new Clock(7, 15);

        tui.start(clock);
    }
}
