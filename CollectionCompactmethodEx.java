//Collection Compact Method:A compact factory method that creates immutable(unmodifiable)collections that dont allow null elements

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionCompactmethodEx {
    public static void main(String[] args) {
        List<String> list = List.of("Gaurav", "Thakare", "CSE");
        Set<String> set = Set.of("A", "B", "C");
        Map<String, Integer> map = Map.of("One", 1, "Two", 2);

        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
    }
}
