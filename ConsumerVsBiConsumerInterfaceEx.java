import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerVsBiConsumerInterfaceEx {
    public static void main(String[] args) {
        Consumer<String> c = name -> System.out.println("Name:" + name);
        c.accept("Raj");

        // bicosnumer
        BiConsumer<String, Integer> c2 = (name, amount) -> System.out.println(name + "Rs." + amount);
        c2.accept("Amar", 500);

    }
}
