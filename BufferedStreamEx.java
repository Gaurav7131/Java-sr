import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class BufferedStreamEx {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream("story.txt"), StandardCharsets.UTF_8))) {
            // write
            bw.write("James Bond");
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
