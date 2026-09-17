import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.SequencedCollection;
import java.util.SequencedMap;

public class Java21FeatSequenceCollectionEx {
    public static void main(String[] args) {
        SequencedCollection<String> slist = new ArrayList<>();
        slist.add("Middle");
        slist.addFirst("First");
        slist.addLast("Last");

        System.out.println("First element:" + slist.getFirst());// First
        System.out.println("Last element:" + slist.getLast());// Last
        System.out.println("Reversed List:" + slist.reversed());// [End,Middle,First]

        // Map:SequenceMap
        SequencedMap<Integer, String> map = new LinkedHashMap<>();
        map.put(3, "Intermediate");
        map.putFirst(1, "First");
        map.putLast(5, "Last");

        System.out.println("First Entry:" + map.firstEntry());// First
        System.out.println("Last Entry:" + map.lastEntry());// Last
        System.out.println("Absent Entry:" + map.putIfAbsent(4, "Four"));
        System.out.println("Map:" + map);
        System.out.println("Reversed Map:" + map.reversed());
    }
}
