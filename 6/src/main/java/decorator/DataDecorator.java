package decorator;

/**
 * Abstract decorator class.
 */

public abstract class DataDecorator implements Data {
    private final Data decoratedData;
    private final DataWriter dw;
    private final DataReader dr;

    protected DataDecorator(Data decoratedData) {
        this.decoratedData = decoratedData;
        this.dw = new DataWriter();
        this.dr = new DataReader();
    }

    /**
     * Writes decoratedData to a file.
     */
    @Override
    public void write() {
        dw.write(this.decoratedData.getData());
    }

    /**
     * Reads from file.
     * @return String data from read file.
     */
    @Override
    public String read() {
        return dr.read();
    }

    /**
     * Getter for decorated data value.
     * @return String data to be returned.
     */
    @Override
    public String getData() {
        return this.decoratedData.getData();
    }

    /**
     * Setter for data.
     * @param data String data to be set.
     */
    @Override
    public void setData(String data) {
        this.decoratedData.setData(data);
    }
}
