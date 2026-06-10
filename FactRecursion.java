class FactRecursion {

    // recusive method
    static int factorial(int n) {
        // base condition
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial is:" + factorial(7));

    }
}