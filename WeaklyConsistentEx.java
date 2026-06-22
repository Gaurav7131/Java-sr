import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class WeaklyConsistentEx {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> c = new ConcurrentHashMap<>();
        c.put(1, "Virat");
        c.put(3, "Tilak");

        // iterator
        Iterator<Integer> l = c.keySet().iterator();

        while (l.hasNext()) {
            System.out.println("Next:" + l.next());

            c.put(6, "Jadega");
        }
    }

}
