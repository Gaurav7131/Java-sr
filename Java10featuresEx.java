import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Java10featuresEx {
    public static void main(String[] args) {
        // Local Variable Type reference 'var'
        // Type is inferred at compile-time as ArrayList<String>
        var fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Mango");

        // loop variable initilization
        for (var fruit : fruits) {
            System.out.println("Fruit:" + fruit);
        }

        // 2.Unmodifiable Collection List.copyOf():strictly disallows null elements
        // never reflect chnages to view of copyOf instance
        var UnmodifiableCopy = List.copyOf(fruits);
        System.out.println("Copy:" + UnmodifiableCopy);
        // UnmodifiableCopy.add("Guava");//UnsupportOps exception

        // 3. Optional.orElseThrow() without arguments
        // Replaces the verbose .get() with explicit exception semantics
        // Optional<String> emptyOptional = Optional.of("Hiii");
        Optional<String> emptyOptional = Optional.empty();
        try {
            // throws NoSuchElementException if empty
            String value = emptyOptional.orElseThrow();
            System.out.println(value);

        } catch (Exception e) {
            System.out.println("Caught expected Exception : value is empty");
        }
    }
}
