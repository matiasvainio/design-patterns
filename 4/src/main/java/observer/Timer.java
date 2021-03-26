package observer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Observable;

public class Timer extends Observable implements Runnable {
    public int getSeconds() {
        return formatTime("ss");
    }

    public int getHours() {
        return formatTime("HH");
    }

    public int getMinutes() {
        return formatTime("mm");
    }

    public void not() {
        setChanged();
        notifyObservers();
    }

    private int formatTime(String s) {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern(s);

        String formattedDate = myDateObj.format(myFormatObj);
        return Integer.valueOf(formattedDate);
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                not();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
