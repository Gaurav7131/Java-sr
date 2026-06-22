import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeEx {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> c = new CopyOnWriteArrayList<>();
        c.add("JoJo");
        c.add("Bob");

        // iterator
        Iterator<String> i = c.iterator();

        while (i.hasNext()) {
            System.out.println("Next:" + i.next());

            // Fail_safe:No exception even though while adidng elementts during Iterating
            c.add("Jessy");
        }
    }
}
