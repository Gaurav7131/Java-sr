import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.*;;

public class SortByValueStreamEx {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();

        m.put("Virat", 97);
        m.put("Rohit", 91);
        m.put("Tilak", 80);

        System.out.println("Unsorted:" + m);

        // We want to sort by Values so used java 8:Stream
        Map<String, Integer> m2 = m.entrySet()
                .stream()

                .sorted(Map.Entry.comparingByValue())

                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new));

        System.out.println("Sorted map:" + m2);

    }

}
