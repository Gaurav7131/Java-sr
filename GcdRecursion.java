public class GcdRecursion {

    // recurisve method
    static int Gcd(int a, int b) {
        // base cond
        if (b == 0)
            return a; // if B{2nd no} is 0, then A{1st no} will be answer
        return Gcd(b, a % b);// find rem.
    }

    public static void main(String[] args) {
        System.out.println("Gcd is:" + Gcd(10, 5));

    }
}
