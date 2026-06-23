import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortByKeyTreeMapEx {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();

        m.put(18, "Virat");
        m.put(12, "Rohit");
        m.put(7, "Dhoni");

        System.out.println("Unsorted map:" + m);

        // smart sorting use Treemap
        Map<Integer, String> m2 = new TreeMap<>(m);
        System.out.println("Sorted Map:" + m2);
    }
}
