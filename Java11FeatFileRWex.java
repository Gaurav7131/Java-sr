import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Java11FeatFileRWex {
    public static void main(String[] args) throws Exception {
        // Fle Path,Files Atributes
        Path tempFile = Files.createTempFile("demo", ".txt");

        // Write file
        Files.writeString(tempFile, "Hello Everyone Hows Going ?", StandardOpenOption.WRITE);

        // Read file
        String context = Files.readString(tempFile);
        System.out.println("Content:" + context);
    }
}
