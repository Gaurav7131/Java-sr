import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class NIOEx {
    public static void main(String[] args) {
        Path myPath = Paths.get("data.txt");

        try {
            String txt = "Hello Guys! How are u?";
            // write
            Files.write(myPath, txt.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);

            // read
            List<String> l = Files.readAllLines(myPath);

            for (String line : l) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
