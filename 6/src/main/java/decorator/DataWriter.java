package decorator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Utility class that writes data to file.
 */
public class DataWriter {

    public void write(String data) {
        try {
            Files.write(Paths.get(Main.FILE_PATH), data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
