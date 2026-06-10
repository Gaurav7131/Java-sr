//Draw Empty rectanlg using Recursive method
public class EmptyRectRecursion {
    // rec method
    static void EmptyRect(int length, int breadth) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= breadth; j++) {
                if (i == 1 || i == length || j == 1 || j == breadth) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Empty rectangle is");
        EmptyRect(6, 10);

    }
}