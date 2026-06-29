public class InheritedThreadLocalEx {
    static InheritableThreadLocal<String> itl = new InheritableThreadLocal<>();

    public static void main(String[] args) {
        // parent thread-main thread
        itl.set(" Vijay " + Thread.currentThread().getName());// set

        Thread t1 = new Thread(() -> {
            // Child thread automatically gets the parent's value
            System.out.println("Name:" + itl.get());// get
        });

        t1.start();

        itl.remove();// avoid mem leak

    }
}
