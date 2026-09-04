
//Files::mismatch(f1,f2):comapres both files byte by byte return long or else return first diff
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Java12FeatFileMismatchEx {
    public static void main(String[] args) throws Exception {
        Path file1 = Files.createTempFile("demo1", ".txt");
        Path file2 = Files.createTempFile("demo2", ".txt");

        // write file
        Files.writeString(file1, "Hello Java", StandardOpenOption.WRITE);
        Files.writeString(file2, "Hello SpringBoot", StandardOpenOption.WRITE);

        long mismatch = Files.mismatch(file1, file2);
        System.out.println(mismatch);

    }
}
