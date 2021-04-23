package prototype;

public class Clock implements Cloneable {
    private ClockHand hourHand, minuteHand;

    public Clock(int hour, int minute) {
        this.hourHand = new ClockHand(hour);
        this.minuteHand = new ClockHand(minute);
    }

    public ClockHand getHourHand() {
        return hourHand;
    }

    public void setHourHand(ClockHand hourHand) {
        this.hourHand = hourHand;
    }

    public ClockHand getMinuteHand() {
        return minuteHand;
    }

    public void setMinuteHand(ClockHand minuteHand) {
        this.minuteHand = minuteHand;
    }

    @Override
    public String toString() {
        return this.hourHand.getValue() + " : " + this.minuteHand.getValue();
    }

    @Override
    public Clock clone() {
        Clock c = null;
        try {
            c = (Clock) super.clone();
            c.hourHand = (ClockHand) hourHand.clone();
            c.minuteHand = (ClockHand) minuteHand.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return c;
    }
}