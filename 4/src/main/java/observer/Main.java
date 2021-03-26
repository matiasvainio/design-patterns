package observer;

public class Main {

    public static void main(String[] args) {
        Timer timer = new Timer();
        Thread thread = new Thread(timer);
        DigitalClock clock = new DigitalClock(timer);
        thread.start();

        timer.addObserver(clock);
    }
}
