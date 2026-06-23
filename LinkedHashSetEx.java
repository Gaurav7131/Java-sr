import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<Integer> l = new LinkedHashSet<>();

        l.add(101);
        l.add(105);
        l.add(107);
        l.add(102);

        System.out.println("Ordered:" + l);
    }

}
