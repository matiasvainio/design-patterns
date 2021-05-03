package iterator;

import java.util.Iterator;

public class MySeparateIteratorThread implements Runnable {
    private final MyCollection collection;

    public MySeparateIteratorThread(MyCollection collection) {
        this.collection = collection;
    }

    @Override
    public void run() {
        Iterator<Integer> iterator = collection.getList().iterator();
        while (iterator.hasNext()) {
            // Heittää ConcurrentModificationExceptionin.
            // Eli molemmat threadit yrittävät tehdä muutoksia samanaikaisesti.
            if (iterator.next() == 5) {
                iterator.remove();
            }
            System.out.print(iterator.next() + ", ");
        }
    }
}
