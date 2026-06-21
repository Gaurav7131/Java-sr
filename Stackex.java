import java.util.Stack;

public class Stackex {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        s.push("Virat");
        s.push("Rohit");

        System.out.println("Result" + s);

        System.out.println("Poped:" + s.pop());// Rohit will be output virat poped

    }

}
