package iterator;

public class SeperateIterators {
    public static void main(String[] args) {
        int threadCount = 2;
        MyCollection collection = new MyCollection();
        MySeparateIteratorThread myThread = new MySeparateIteratorThread(collection);
        Thread[] threads = new Thread[threadCount];


        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(myThread);
            threads[i].start();
        }

//        Ei kaadu..
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
