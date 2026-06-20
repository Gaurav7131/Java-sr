public class ExceptionHandling {
    public static void main(String[] args) {

        try {
            System.out.println("hii");
            int[] a = new int[5];
            a[10] = 50;

        }
        // Child Exception(Most specific)
        catch (ArithmeticException e) {
            System.out.println("solve Arithmatic EX");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndex Problem Solved");
        }
        // Parant excpetion(Most general)
        catch (Exception e) {
            System.out.println("I will Handle Exception" + e);
        }

    }

}
