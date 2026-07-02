import java.util.concurrent.*;

public class ThreadFactoryEx {
    public static void main(String[] args) {
        ThreadFactory customfactory = new ThreadFactory() {
            private int counter = 1;

            public Thread newThread(Runnable r) {
                Thread t = new Thread(null, r, "Payment-Processor", counter++);
                t.setPriority(Thread.MAX_PRIORITY);
                return t;

            }
        };

        ExecutorService manager = Executors.newFixedThreadPool(2, customfactory);
        manager.execute(() -> {
            System.out.println("Running in:" + Thread.currentThread().getName());// o/p: Running in:Payment-Processor
            manager.shutdown();
        });
    }
}
