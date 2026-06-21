import java.util.Set;
import java.util.HashSet;

public class SetSubinterface {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();

        s.add("Elon");
        s.add("Mark");
        s.add("Musk");
        s.add("Elon"); // no dublicate alow

        System.out.println("Set:" + s);

        // default java 8 methods
        s.removeIf(sp -> sp.contains("Elon"));
        System.out.println("Removed:" + s);
    }

}
