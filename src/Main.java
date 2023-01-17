public class Main {
    public static void main(String[] args) {
        DataSource source = new FileDataSource("output.txt");
        source.writeData("Hello, world!");

        DataSourceDecorator decorator = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("output.txt")
                )
        );

        decorator.writeData("This is a random sentence that my brain just came up with. I hope it makes sense.");
    }
}

