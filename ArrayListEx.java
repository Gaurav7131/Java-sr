import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> s = new ArrayList<>();

        // ArrayList: More Search,less insertion
        s.add("Mark");
        s.add("Burg");

        System.out.println("Searched:" + s.get(0));

    }

}
