import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class StandaredWriteOp {
    public static void main(String[] args) {
        Path myPath = Paths.get("stdwrite.txt");
        try {
            String txt = "Standard Write Operations\n";
            Files.write(myPath, txt.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println(txt);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
