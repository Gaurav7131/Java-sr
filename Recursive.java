public class Recursive {

    // recusrive method
    static void countdown(int number) {

        // base condition
        if (number == 0) {
            System.out.println("Blast off Rocket");
            return;// must have return if missed it shows infinite result and runs of out memory
                   // and throws StackOverflowError
        }
        // just print number for a while
        System.out.println(number);
        // calling rec.method
        countdown(number - 1);
    }

    public static void main(String[] args) {
        System.out.println("Rocket");
        countdown(5);

    }
}