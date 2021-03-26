package observer;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {

    private final Timer timer;
    private int seconds, minutes, hours = 0;

    public DigitalClock(Timer timer) {
        this.timer = timer;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.seconds = timer.getSeconds();
        this.minutes = timer.getMinutes();
        this.hours = timer.getHours();

        System.out.println(this);
    }

    @Override
    public String toString() {
        return hours + " : " + minutes + " : " + seconds;
    }
}
