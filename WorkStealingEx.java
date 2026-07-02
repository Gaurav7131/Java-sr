import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkStealingEx {
    public static void main(String[] args) {
        // Work stealing algo:newWorkStealingPool
        ExecutorService manager = Executors.newWorkStealingPool();

        for (int i = 0; i <= 3; i++) {
            final int blockId = i;

            manager.submit(() -> {
                System.out.println("Processed" + blockId + " by" + Thread.currentThread().getName());
            });
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        manager.shutdown();

    }
}
