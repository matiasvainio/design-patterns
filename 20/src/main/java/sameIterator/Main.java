package sameIterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        MyThread myThread = new MyThread(list.iterator());
        Thread[] threads = new Thread[2];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(myThread);
            threads[i].start();
        }
        // Poistaminen heittää poikkeuksen ConcurrentModificationException. Johtuen siitä, että usea säie
        // yrittää muokata samaa elementtiä samanaikaisesti.
        // list.remove(0);

        for (Thread t : threads) {
            t.join();
        }
    }
}
