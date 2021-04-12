package observer;

public class Main implements Runnable {

    public static void main(String[] args) {
        Timer timer = new Timer();
        Thread thread = new Thread(timer);
        DigitalClock clock = new DigitalClock(timer);
        thread.start();

        timer.addObserver(clock);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread());
    }
}
