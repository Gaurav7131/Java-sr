
//Stream API:A declarative pipeline to process sequences of elements (filtering, mapping, reducing) from collections without modifying the original data source.
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiEx {
    public static void main(String[] args) {
        List<String> lang = List.of("Java", "SpringBoot", "Python", "Javascipt", "Docker");
        List<String> filtered = lang.stream().filter(n -> n.startsWith("J")).map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(filtered);// JAVA,JAVASCRIPT
    }
}
