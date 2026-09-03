import java.util.List;
import java.util.function.Predicate;

public class Java11FeatPredicateNotBlankEx {
    public static void main(String[] args) {
        List<String> items = List.of("Java", "", "Kotlin", "", "Ruby");

        // clean Readibility with method ref
        List<String> nonBlank = items.stream().filter(Predicate.not(String::isBlank)).toList();
        System.out.println(nonBlank);// [Java, Kotlin, Ruby]
    }
}
