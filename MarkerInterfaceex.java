import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class MarkerInterfaceex {
    public static void main(String[] args) {
        // for ArrayList have randomacess 0(1) faster-indexing
        List<String> arraylist = new ArrayList<>();

        // For LinkList,dont have randomacess have only iterator 0(n)-slower
        List<String> linklist = new LinkedList<>();

        // checking
        System.out.println("Arraylist Checking:");
        checkVipPass(arraylist);

        // checking linklist
        System.out.println("LinkList checking:");
        checkVipPass(linklist);

    }

    // Bouncer
    public static void checkVipPass(List<?> list) {

        // used instanceof operator to check exist or not
        if (list instanceof RandomAccess) {
            System.out.println("Access grant");
        } else {
            System.out.println("Reject Permit!");
        }
    }
}