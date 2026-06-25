import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionVsBiFunctionInterfaceEx {
    public static void main(String[] args) {
        // Function<T,R>:String,Integer:1i/p 1o/p
        Function<String, Integer> name = str -> str.length();
        System.out.println("Name:" + name.apply("Virat"));

        // Bif<T,U,R>:2 i/p 1 0/p
        BiFunction<String, String, String> b = (name1, sirname) -> name1 + " " + sirname;
        System.out.println("Name:" + b.apply("Java", "Developers"));

        // Consumer<T>:1 i/p return nothing void
        Consumer<String> c = message -> System.out.println(message + "Raj");
        c.accept("Name:");

        // biconsumer<T,U>:takes 2 i/p return nothing
        BiConsumer<String, Integer> account = (name3, amount) -> System.out.println(name3 + " rs." + amount);
        account.accept("Miyaan", 30000);
    }
}
