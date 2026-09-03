import java.util.function.BiFunction;

public class Java11FeatLambdaVarEx {
    public static void main(String[] args) {
        // uniform var syntax
        BiFunction<Integer, Integer, Integer> add = (var a, var b) -> (a + b);
        System.out.println("Sum:" + add.apply(3, 4));

        // Allowing annotation @Notnull wihtout forcing explcit types,verbose
        BiFunction<Integer, Integer, Integer> comparator = (@NonNull var x, @NonNull var y) -> x.compareTo(y);
        System.out.println("Comparison:" + comparator.apply(30, 10));
    }
}
