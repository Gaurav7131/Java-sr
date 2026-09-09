import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Java13JrtModuleEx {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getFileSystem(URI.create("jrt:/"));

        // Accessing and validating:targeting /module directory
        Path moduleEntry = fs.getPath("/modules/java.base");
        System.out.println("Accessing modules Directory:" + moduleEntry);// targeted directory

        // java 13:stricly validates path boundaries
        Path clasasPath = fs.getPath("/modules/java.base/java/lang/Object.class");
        System.out.println("Target File exists:" + java.nio.file.Files.exists(clasasPath));// return boolean value:T/F
    }
}
