public class ThreadLocalEx {
    // every thread has its own individual copy
    static ThreadLocal<String> tl = new ThreadLocal<>();

    public static void main(String[] args) {
        // runnable
        Runnable task = () -> {
            // set
            tl.set("Data for" + Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName() + " Value " + tl.get());// get
        };

        Thread t1 = new Thread(task, "dev1");
        Thread t2 = new Thread(task, "Dev2");

        t1.start();
        t2.start();

        tl.remove();// avoid mem leak best practice
    }
}
