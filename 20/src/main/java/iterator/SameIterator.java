package iterator;

import java.util.Iterator;

public class SameIterator {
    public static void main(String[] args) {
        int threadCount = 2;
        MyCollection collection = new MyCollection();
        Iterator<Integer> iterator = collection.getList().iterator();
        MyThread myThread = new MyThread(iterator);
        Thread[] threads = new Thread[threadCount];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(myThread);
            threads[i].start();
        }

//        Kaatuu..
//        collection.getList().remove(6);

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
