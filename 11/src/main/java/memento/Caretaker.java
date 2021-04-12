package memento;

import java.util.List;

public class Caretaker {
//    private List<Object> list;
    private Object obj;

    public void save(Originator o) {
        this.obj = o.createMemento();
    }

    public void restore(Originator o) {
        o.restoreFromMemento(obj);
    }
}
