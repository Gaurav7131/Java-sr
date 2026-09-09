//The runtime now enforces strict checks and rejects arguments containing illegal embedded null characters by throwing an IllegalArgumentException.
public class Java14FeatProcessBuilderEx {
    public static void main(String[] args) {
        try {
            // Passing args containing embedded NUL byte
            ProcessBuilder pb = new ProcessBuilder("echo", "happy\u0000Gaurav");
            System.out.println("ProcessBuilder works out:" + pb);
            pb.start();
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Restricted args:" + e.getMessage());
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
