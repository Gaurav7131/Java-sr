import java.util.ArrayList;
import java.util.List;

public class ListSubInterface {
    public static void main(String[] args) {
        // We used ArrayList for List-Insert order Maintained+Duplicates allow
        List<String> ls = new ArrayList<>();

        ls.add("Merry");
        ls.add("Cherry");
        ls.add("Henry");
        ls.add("Aiva");
        ls.add("Cherry");// Allow duplicate

        System.out.println("Total:" + ls);

        System.out.println("Contains:" + ls.contains("Merry"));

        // Default Method(java 8 magic)
        ls.removeIf(name -> name.contains("Aiva"));
        System.out.println("Result:" + ls);

        System.out.println("ismepty:" + ls.isEmpty());

        System.out.println("");

    }

}
