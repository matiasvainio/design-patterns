package decorator;

public class Main {
    public static final String SECRET_KEY = "foobar!";
    public static final String FILE_PATH = "src/main/resources/file.txt";

    public static void main(String[] args) {
        TextUI tui = new TextUI();
        tui.start();
    }
}
