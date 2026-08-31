//Effectively Final Variables: A local variable that is not explicitly declared as final, but its value is never modified after initialization. Lambdas and anonymous classes can capture these variables safely without requiring the explicit final keyword.
public class EffectivelyFinalEx {
    public static void main(String[] args) {
        int factor = 1;// not declared as final,but never modified
        Runnable r = () -> System.out.println("Factor:" + factor);
        r.run();
        // factor=3;//compile-time error
    }
}
