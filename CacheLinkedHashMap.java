import java.util.Map;
import java.util.LinkedHashMap;

public class CacheLinkedHashMap {
    public static void main(String[] args) {
        // set max size for cache
        int MAX_SIZE = 3;

        LinkedHashMap<Integer, String> cache = new LinkedHashMap<Integer, String>(MAX_SIZE, 0.75f, true)
        // LRU-removeEldestEntry()
        {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > MAX_SIZE;// if crossed MAX_Size 3; remove all
            }
        };

        cache.put(1, "One");
        cache.put(2, "Two");
        cache.put(3, "Three");

        // get so that recent access at last pos
        cache.get(1);

        // put another entry
        cache.put(4, "Four");

        System.out.println("After get:" + cache);

    }
}