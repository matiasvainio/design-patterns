package iterator;

import java.util.Iterator;

public class MyThread implements Runnable {
    private final Iterator<Integer> iterator;

    public MyThread(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    @Override
    public void run() {
        while (iterator.hasNext()) {
            // Heittää NoSuchElementExceptionin
            // Toinen säie ehtii tuhoamaan elementin ennen toista, joten tämä toinen on ihmeissään kun
            // kyseistä elementtiä ei löydy.
            if (iterator.next() == 5) {
                iterator.remove();
            }
            System.out.print(iterator.next() + ", ");
        }
    }
}
