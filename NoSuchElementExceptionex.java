import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NoSuchElementExceptionex {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        // empty list l.add("Ronny")

        // iterator
        Iterator<String> s = l.iterator();

        // list is empty and called remove method:(NoSuchElementExceptionex.java:13)
        // l.remove(0);

        System.out.println("Next:" + s.next());

    }

}
