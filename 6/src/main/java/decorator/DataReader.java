package decorator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DataReader {

    public String read() {
        try {
            return new String(Files.readAllBytes(Paths.get(Main.FILE_PATH)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
