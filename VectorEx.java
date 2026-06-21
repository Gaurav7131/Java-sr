import java.util.List;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        List<String> l = new Vector<>();

        // multithreading
        l.add("Virat");
        System.out.println("Vector:" + l);

    }

}
