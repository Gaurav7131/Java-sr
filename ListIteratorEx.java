import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        List<String> s = new ArrayList<>(Arrays.asList("A", "B", "C"));

        // Listiterator
        ListIterator<String> li = s.listIterator(s.size());// cursor

        // hasprev method and hasNext()too because it can go forward and backwar also
        while (li.hasPrevious()) {
            System.out.println("Previous:" + li.previous());
        }
    }
}
