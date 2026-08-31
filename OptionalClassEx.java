import java.util.Optional;

//6. Optional Class:container object that may or may not contain a non-null value, designed to prevent NullPointerException and force callers to handle missing data explicitly.
public class OptionalClassEx {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(null);
        String result = name.orElse("Default User:)");
        System.out.println(result);// Default User:)
    }
}
