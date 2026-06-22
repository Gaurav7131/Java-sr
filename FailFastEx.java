import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastEx {

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();

        l.add("Jessy");
        l.add("Ronny");

        // Iterator
        Iterator<String> i = l.iterator();

        while (i.hasNext()) {
            System.out.println("Next:" + i.next());

            // Fail fast: ConcurrentModificationException adding element while iterating
            l.add("Joker");

        }

    }
}
