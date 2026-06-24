import java.util.function.Function;

public class FunctionInterfaceMethods {
    public static void main(String[] args) {
        Function<Integer, Integer> multiply = x -> x * 5;
        Function<Integer, Integer> add = x -> x + 10;

        // addThen
        int result = multiply.andThen(add).apply(5);
        System.out.println("ADDThen:" + result);

        // compose
        int result2 = multiply.compose(add).apply(5);
        System.out.println("Compose:" + result2);

        // identity:mirror
        Function<String, String> mirror = Function.identity();
        System.out.println("Identity:" + mirror.apply("Hello Connections"));// if put null it shows random identity o/p

    }
}