package facade;

public class Memory {
    private String[] locations;

    public Memory() {
        locations = new String[16];
    }

    public void load(int pos, String data) {
        locations[pos] = data;
    }

    public String getData(int pos) {
        return locations[pos];
    }
}
