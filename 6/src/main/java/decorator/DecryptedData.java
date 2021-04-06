package decorator;

/**
 * Decrypted data class. This extends DataDecorator abstract class.
 */
public class DecryptedData extends DataDecorator {

    protected DecryptedData(Data decoratedData) {
        super(decoratedData);
    }

    /**
     * Uses setData method to save decrypted string to object. AES.decrypt is static method which decrypts
     * the string to plain text.
     */
    public void decrypt() {
        this.setData(AES.decrypt(this.getData(), Main.SECRET_KEY));
    }

    /**
     * Decrypts data and uses parent class' write method to write string to a text file.
     */
    @Override
    public void write() {
        decrypt();
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
