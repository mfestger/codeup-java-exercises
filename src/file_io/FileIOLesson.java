/**
 * Created by michaelfestger on 5/25/17.
 */
package file_io;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileIOLesson {
    public static void main(String[] args) throws IOException {
        String directory = "data";
        String filename = "info.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }
        if (! Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }
        Files.readAllLines(dataFile);

    }

//    List<String> groceryList = Arrays.asList("coffee", "milk", "sugar", "mango");
//    Files.write(dataFile, groceryList);


}
