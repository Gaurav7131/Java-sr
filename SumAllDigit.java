//1234 then +2+3+4=10
class SumAllDigit {
    // recusrive method
    static int SumAll(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of all digit:" + SumAll(1234));
    }
}