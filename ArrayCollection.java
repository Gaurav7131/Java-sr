import java.util.ArrayList;
import java.util.HashMap;

public class ArrayCollection {
    public static void main(String[] args) {
        String[] s = new String[4];

        s[0] = "Ajay";
        s[1] = "Bob";
        s[2] = "James";
        s[3] = "Mark";
        // s[4] = "Musk";

        // array size fixed till 3
        System.out.println("FOuth index is:" + s[3]);

        // ============= Collection==========
        // Built in method
        ArrayList<String> p = new ArrayList<>();

        // Dont worry about size collection can automatically shrink by remove obj and
        // grows by adding.
        p.add("AJAY");
        p.add("James");
        p.add("Elon");
        p.add("Musk");

        System.out.println("Total Name" + p);

        // Deletion
        p.remove("James");
        System.out.println("Removed" + p);

        // ==============Map(Key:Value)=====
        HashMap<Integer, String> register = new HashMap<>();

        register.put(1, "Ajay");
        register.put(2, "jay");
        register.put(10, "Aira");

        System.out.println("Total" + register);

        // built-in method
        register.clone();
        System.out.println("Clone:" + register);
    }

}
