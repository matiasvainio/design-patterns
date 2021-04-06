package decorator;

/**
 * Decrypted data class. This extends DataDecorator abstract class.
 */
public class EncryptedData extends DataDecorator {

    protected EncryptedData(Data decoratedData) {
        super(decoratedData);
    }

    /**
     * Uses setData method to save encrypted string to object. AES.encrypt is static method which encrypts
     * the string to plain text.
     */
    public void encrypt() {
        this.setData(AES.encrypt(this.getData(), Main.SECRET_KEY));
    }

    /**
     * Decrypts data and uses parent class' write method to write string to a text file.
     */
    @Override
    public void write() {
        encrypt();
        super.write();
    }

//    Nämähän ovat tietysti turhia, koska toiminnallisuus on luotu jo abstraktissa yliluokassa.
//
//    /**
//     * Reads data from file using parent class' read method.
//     * @return String data read from file.
//     */
//    @Override
//    public String read() {
//        return super.read();
//    }
//
//    /**
//     * Returns data stored to data object in parent class.
//     * @return String data saved to object.
//     */
//    @Override
//    public String getData() {
//        return super.getData();
//    }
//
//    /**
//     * Setter for data. Uses parent class' setData method.
//     * @param data String data to be set.
//     */
//    @Override
//    public void setData(String data) {
//        super.setData(data);
//    }
}
