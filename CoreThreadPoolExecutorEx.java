import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CoreThreadPoolExecutorEx {
    public static void main(String[] args) {
        // Core size: 2, Max size: 4, Keep alive: 60 secs, Queue capacity: 2
        ThreadPoolExecutor manager = new ThreadPoolExecutor(2, 4, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2));

        for (int i = 1; i <= 5; i++) {
            final int taskID = i;
            manager.execute(() -> {
                System.out.println(" Task " + taskID + " By " + Thread.currentThread().getName());
            });
        }
        manager.shutdown();
    }
}