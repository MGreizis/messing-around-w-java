import java.io.*;

public class FileDataSource implements DataSource {

    private String fileName;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeData(String data) {
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write(data);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readData() {
        String data = "";
        try {
            FileReader fr = new FileReader(fileName);
            int i;
            while ((i = fr.read()) != -1) {
                data += (char) i;
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
