package memento;

public class Originator {
    private int state;

    public Object joinGame() {
        this.state = (int) (Math.random() * 5) + 1;
        return createMemento();
    }

    public Object createMemento() {
        return new Memento(state);
    }

    public void restoreFromMemento(Object obj) {
        Memento memento = (Memento) obj;

        System.out.println("Thread: " + Thread.currentThread().getId() +  " Luku originaattorissa: " + this.state);
        System.out.println("Thread: " + Thread.currentThread().getId() + " Luku mementossa: " + memento.getState());

        if (this.state == memento.getState()) {
            System.out.println("SAMAT!");
        }
        this.state = memento.getState();
    }

    private static class Memento {
        private final int state;

        public Memento(int state) {
            this.state = state;
        }

        public int getState() {
            return state;
        }
    }
}
