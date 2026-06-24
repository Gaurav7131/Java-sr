import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class HeroesFunctionalProEx {

    public static void main(String[] args) {
        // Predicate<T>:T:type(inspector):takes i/p and return True/False ,test() method
        Predicate<Integer> p = num -> num > 10;
        System.out.println("Predicate:" + p.test(20));// true

        // Function<T,R>:t:type,R;return,(Transformer)Takes i/p and return,aaply()
        Function<String, Integer> f = str -> str.length();
        System.out.println("Function:" + f.apply("Virat"));// o/p:5

        // Consumer<T>:bluehole, takes i/p return nothing,accept() method,string wrapper
        Consumer<String> c = message -> System.out.println("Hihi  I had nothing to give:" + message);
        c.accept("Consumer");

        // Supplier<T>:(Factory)dont need i/p but return somethng ,get()
        Supplier<Double> s = () -> Math.random();// no i/p
        System.out.println("Random Supplier:" + s.get());

    }
}
