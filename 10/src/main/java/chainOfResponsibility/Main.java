package chainOfResponsibility;

public class Main {

    public static void main(String[] args) {
        Supervisor sup = new Supervisor();
        Manager man = new Manager();
        CEO ceo = new CEO();

        sup.setSuccessor(man);
        man.setSuccessor(ceo);

        TUI tui = new TUI(sup);
        tui.start();
    }
}
