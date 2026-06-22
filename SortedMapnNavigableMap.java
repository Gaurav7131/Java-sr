import java.util.NavigableMap;
import java.util.TreeMap;

public class SortedMapnNavigableMap {
    public static void main(String[] args) {
        // ordered : TreeMap & Navigablemap :advanced method>firstkey,lowerkey..
        NavigableMap<Integer, String> m = new TreeMap<>();

        m.put(101, "Raj");// top
        m.put(102, "Ravi");
        m.put(106, "Radha");

        System.out.println("Firstkey" + m.firstKey());
        System.out.println("Lower:" + m.lowerKey(106)); // before 106 key wiil be 102 in map
        System.out.println("Higher:" + m.higherKey(102)); // after 102 key will be 106 if i give 106 it shows null
    }
}
