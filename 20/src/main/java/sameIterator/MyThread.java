package sameIterator;

import java.util.Iterator;
import java.util.List;

public class MyThread implements Runnable {
    private final Iterator<Integer> iterator;

    public MyThread(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    @Override
    public void run() {
        while (iterator.hasNext()) {
            if (iterator.next() == 5) {
                // Tämä aiheuttaa sen, että kun elementti on poistettu, toinen threadi on ihmeissään, kun sitä ei löydy.
                // System.out.println(Thread.currentThread() + " poistetaan: " + iterator.next());
                // iterator.remove();
            }
            System.out.println(Thread.currentThread() + " iterator: " + iterator.next());
        }
    }
}
