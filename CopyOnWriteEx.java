import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class CopyOnWriteEx {
    public static void main(String[] args) {
        List<String> s = new CopyOnWriteArrayList<>();

        // other threads can read it without lock
        s.add("Thread1 Confidential");
        System.out.println("Result:" + s);

    }
}
