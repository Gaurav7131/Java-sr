import java.util.List;

//MethodExpression:shorthand for calling existing method directly when a lambda does nothing but pass parameters through to that method.
public class MethodRefEx {
    public static void main(String[] args) {
        List<String> names = List.of("Gaurav", "Thakare", "CSE");
        // Lambda expes:names.forEach(s->Sout(s));
        names.forEach(System.out::println);
    }
}
