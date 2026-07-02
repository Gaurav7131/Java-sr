import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadStarvationEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Pool only has ONE thread
        ExecutorService manager = Executors.newSingleThreadExecutor();

        manager.submit(() -> {
            System.out.println("Task 1 started. Submitting Task 2...");

            // Task 1 submits Task 2 to the SAME pool and waits for it
            Future<String> future = manager.submit(() -> "Task 2 Result");

            try {
                // STARVATION HAPPENS HERE!
                // Task 1 is waiting for Task 2.
                // But Task 2 can never start because Task 1 is holding the only 1 thread!
                System.out.println(future.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}