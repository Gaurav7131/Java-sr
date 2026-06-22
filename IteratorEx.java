import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();

        l.add("Ram");
        l.add("Jojo");
        l.add("Lilly");

        // iterator counts elements in List
        Iterator<String> i = l.iterator();

        // whenever we have element(hasnext()) dig and explore next() because iterator
        // can move forwardonly not backward but listiterator can do both so it has has
        // Previous method()
        while (i.hasNext()) {
            System.out.println("Next:" + i.next());

        }
    }

}
