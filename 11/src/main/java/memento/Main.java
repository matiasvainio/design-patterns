package memento;

public class Main implements Runnable {

    public static void main(String[] args) {
        var main = new Main();
        var thread = new Thread(main);
        thread.start();

        var originator = new Originator();

        Object memento = originator.joinGame();
        originator.joinGame();

        originator.restoreFromMemento(memento);
    }

    @Override
    public void run() {
        var originator = new Originator();
        Object memento = originator.joinGame();
        originator.joinGame();

        originator.restoreFromMemento(memento);
    }
}
