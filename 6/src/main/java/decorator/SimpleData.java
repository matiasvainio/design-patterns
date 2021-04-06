package decorator;

/**
 * Simple data object.
 */
public class SimpleData implements Data {
    private String data;
    private final DataWriter dw;
    private final DataReader dr;

    public SimpleData() {
        this.data = null;
        this.dw = new DataWriter();
        this.dr = new DataReader();
    }

    @Override
    public void write() {
        dw.write(getData());
    }

    @Override
    public String read() {
        return dr.read();
    }

    @Override
    public String getData() {
        return this.data;
    }

    @Override
    public void setData(String data) {
        this.data = data;
    }
}
