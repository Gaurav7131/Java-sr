import java.util.LinkedList;
import java.util.List;

public class LinkListEx {
    public static void main(String[] args) {
        // Generic + diamond operator
        List<String> s = new LinkedList<>();

        s.add("Hello");
        s.add("Hi");
        s.add("Archer");

        // faster isnert/delete 0(1)
        s.add(1, "Virat");

        s.remove(0);

        System.out.println("LinkedList:" + s);
    }
}
