// Concrete decorators call the wrapped object and alter its result in some way.
public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        System.out.println("Encrypting data");
        super.writeData(data);
    }

    @Override
    public String readData() {
        System.out.println("Decrypting data");
        return super.readData();
    }
}