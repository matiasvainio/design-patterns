package decorator;

public class EncryptedData extends DataDecorator {

    protected EncryptedData(Data decoratedData) {
        super(decoratedData);
    }

    public void encrypt() {
        this.setData(AES.encrypt(this.getData(), Main.SECRET_KEY));
    }

    @Override
    public void write() {
        encrypt();
        super.write();
    }

    @Override
    public String read() {
        return super.read();
    }

    @Override
    public String getData() {
        return super.getData();
    }

    @Override
    public void setData(String data) {
        super.setData(data);
    }
}
