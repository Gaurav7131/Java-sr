public class ThreadLocalNotIdeal {
    // Creating this for 1 Million virtual threads will crash the memory!
    public static ThreadLocal<String> userContext = new ThreadLocal<>();

    public static void main(String[] args) {
        Thread.startVirtualThread(() -> {
            userContext.set("User_Rahul"); // Mutable and heavy
            System.out.println("Processing for: " + userContext.get());
        });
    }
}