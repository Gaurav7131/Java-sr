import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FindFileExte {
    public static void main(String[] args) {
        Path p = Paths.get("D:\\");

        try (DirectoryStream<Path> dr = Files.newDirectoryStream(p, "*")) {
            for (Path file : dr) {
                System.out.println("File Name:" + file.getFileName());
            }
        } catch (IOException e) {

            System.out.println("ERROR" + e.getMessage());
        }
    }

}
