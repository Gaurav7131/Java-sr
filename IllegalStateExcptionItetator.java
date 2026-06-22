import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IllegalStateExcptionItetator {

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Jaguar");
        l.add("Mercedes");

        // iterator
        Iterator<String> i = l.iterator();

        // Remove() before next():IllegalStateException
        System.out.println("Remove");
        i.remove();

        // this part wont execute because it called remove method before next()
        while (i.hasNext()) {
            System.out.println("Next" + i.next());
        }
    }
}
