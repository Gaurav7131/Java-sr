@FunctionalInterface
interface Calculator {
    int compute(int a, int b);

}

public class FunctionalInterfacexLambda {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        System.out.println("Sum:" + add.compute(10, 20));// sum:30
    }

}
