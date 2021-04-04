package decorator;

public class DecryptedData extends DataDecorator {

    protected DecryptedData(Data decoratedData) {
        super(decoratedData);
    }

    public void decrypt() {
        this.setData(AES.decrypt(this.getData(), Main.SECRET_KEY));
    }

    @Override
    public void write() {
        decrypt();
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
