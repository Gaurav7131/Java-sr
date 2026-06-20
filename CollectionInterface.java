import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterface {
    public static void main(String[] args) {
        // Collection(Super Parent)> Arraylist>Child
        Collection<String> batch = new ArrayList<>();

        batch.add("Bob");
        batch.add("Oggy");
        batch.add("Jack");
        batch.add("Dolly");

        System.out.println("Total Batch:" + batch.size());
        System.out.println("Contains:" + batch.contains("Bob"));

        // default method:java(Magic of java 8)
        batch.removeIf(person -> person.contains("Jack"));
        System.out.println("Batch contains" + batch);

        // method2:isEmpty(T/F)
        System.out.println("ISempty" + batch.isEmpty());

        // stream
        batch.stream();
        System.out.println("stream" + batch);

        // clear
        batch.clear();
        System.out.println("after clr" + batch);

    }
}
