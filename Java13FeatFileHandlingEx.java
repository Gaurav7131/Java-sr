import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Java13FeatFileHandlingEx {
    public static void main(String[] args) {
        Path missingPath = Paths.get("non_existing.zip");

        try {
            // Attempting to open witout create
            FileSystems.newFileSystem(missingPath, Map.of("create", "false"));// true:created file,false:not exist
            System.out.println("File Created");
        } catch (NoSuchFileException e) {
            System.out.println("Not Found:" + e.getClass().getSimpleName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
