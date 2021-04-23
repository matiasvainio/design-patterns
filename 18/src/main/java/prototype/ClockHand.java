package prototype;

public class ClockHandImpl implements ClockHand {
    private int value;

    public ClockHandImpl() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public ClockHand clone() {
        return null;
    }
}
