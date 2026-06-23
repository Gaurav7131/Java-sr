import java.util.HashSet;
import java.util.Set;

public class UnmodifiedSetEx {

    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("Safe");

        // safe set
        Set<String> readOnlySet = java.util.Collections.unmodifiableSet(s);
        readOnlySet.add("Python");// error UnsupprtoperationException

    }
}
