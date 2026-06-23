import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeSetEx {
    public static void main(String[] args) {
        // modern way thread safe
        Set<String> s = ConcurrentHashMap.newKeySet();
        s.add("safe set");
        System.out.println(s);

        /*
         * older way
         * // thread safe
         * Set<String> set = java.util.Collections.synchronizedSet(s);
         */

    }
}
