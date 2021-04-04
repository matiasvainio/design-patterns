package decorator;

public abstract class DataDecorator implements Data {
    private final Data decoratedData;
    private final DataWriter dw;
    private final DataReader dr;

    protected DataDecorator(Data decoratedData) {
        this.decoratedData = decoratedData;
        this.dw = new DataWriter();
        this.dr = new DataReader();
    }

    @Override
    public void write() {
        dw.write(this.decoratedData.getData());
    }

    @Override
    public String read() {
        return dr.read();
    }

    @Override
    public String getData() {
        return this.decoratedData.getData();
    }

    @Override
    public void setData(String data) {
        this.decoratedData.setData(data);
    }
}
