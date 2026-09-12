import java.io.LineNumberReader;
import java.io.StringReader;

public class Java16FeatLineNumberReaderEx {
    public static void main(String[] args) throws Exception {
        String mixedString = "Header\\rSectionOne\\nSectionTwo\\r\\nFooter";

        try (LineNumberReader reader = new LineNumberReader(new StringReader(mixedString))) {
            while (reader.readLine() != null) {

                // iterating over stream
            }
            System.out.println("Normalized Total Count:" + reader.getLineNumber());
        }
    }
}
