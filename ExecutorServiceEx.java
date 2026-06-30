import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ExecutorServiceEx {
    public static void main(String[] args) {
        ExecutorService manager = Executors.newFixedThreadPool(3);

        // asign task
        for (int i = 1; i <= 5; i++) {
            final int customerId = i;
            manager.execute(() -> {
                System.out.println("Serving to" + customerId + "by" + Thread.currentThread().getName());
            });
        }
        manager.shutdown();
    }
}