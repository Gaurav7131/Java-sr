import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ByteStreamVsCharTryResType {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("story.txt");
                FileReader reader = new FileReader("story.txt"))

        {
            // st of try & write,read ops
            writer.write("Hello Developers");
            writer.flush();// forcefully push to write

            // read character
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character); // type casting

            }
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }

    }
}