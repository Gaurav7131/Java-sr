import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorByComparingEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Leonard the Vinci", "Bob Catlina", "Jack Sparrrow");

        // method ref in place of lambda exp ::
        names.sort(Comparator.comparing(String::length));

        System.out.println("Names:" + names);

    }
}