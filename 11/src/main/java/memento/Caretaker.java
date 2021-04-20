package memento;

public class Caretaker {
    private Object obj;

    public void save(Originator o) {
        this.obj = o.createMemento();
    }

    public void restore(Originator o) {
        o.restoreFromMemento(obj);
    }
}
