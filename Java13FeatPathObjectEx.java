import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Java13FeatPathObjectEx {
    public static void main(String[] args) throws Exception {
        Path ziPath = Paths.get("archive.zip");

        Map<String, String> env = Map.of("create", "true");
        try (FileSystem fs = FileSystems.newFileSystem(ziPath, env)) {
            Path internalPath = fs.getPath("/readme.txt");
            Files.writeString(internalPath, "Hello Rio");
            System.out.println("Writing inside jar:" + Files.readString(internalPath));
        }

    }
}
