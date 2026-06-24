import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class UnifiedAPiEx {
    public static void main(String[] args) {
        // SequenceList
        List<String> l = new ArrayList<>();
        l.addFirst("Gaurav");
        l.add("Thakare");
        l.add("CSE");
        l.addLast("Software Engineer");
        System.out.println(l.remove("Thakare"));
        l.getLast();
        System.out.println("List:" + l);

        // SequencedSet
        LinkedHashSet<Integer> lh = new LinkedHashSet<>();
        lh.addFirst(1);
        lh.add(2);
        lh.add(6);

        lh.addFirst(7);// first emtry 7 at any cost rather than 1
        lh.addLast(10);// last entry 10 at any cost

        System.out.println(lh);

        // SequnecedMap>Linkedhashmap:key-value pair
        LinkedHashMap<Integer, String> h = new LinkedHashMap<>();
        h.put(1, "One");
        h.put(3, "Three");
        h.put(4, "Four");

        System.out.println(h.pollFirstEntry());// 1-extract firstentry
        System.out.println(h.pollLastEntry());// 4

    }

}
