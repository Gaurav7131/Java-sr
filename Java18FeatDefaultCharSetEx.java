import java.nio.charset.Charset;

public class Java18FeatDefaultCharSetEx {
    public static void main(String[] args) {

        // Java 18 picks UTF-8 bydefault regardless of underlying OS
        Charset defaulCharset = Charset.defaultCharset();
        System.out.println("Default Charset:" + defaulCharset.displayName());
    }
}