public class YieldMethod {
    public static void main(String[] args) {
        // thread1
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Thread1 running");
                Thread.yield();
            }
        });
        // t2
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Thread2 Running");
            }
        });
        t1.start();
        t2.start();
    }
}