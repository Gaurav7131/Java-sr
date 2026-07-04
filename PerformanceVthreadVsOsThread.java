import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PerformanceVthreadVsOsThread {
    public static void main(String[] args) {
        int taskcount = 1000;

        long platformthread = testPerformace(Executors.newFixedThreadPool(100), taskcount);
        System.out.println("Platform thread" + platformthread + "ms");

        long virtualthread = testPerformace(Executors.newVirtualThreadPerTaskExecutor(), taskcount);
        System.out.println("Virtual thread" + virtualthread + "ms");
    }

    static long testPerformace(ExecutorService executors, int taskcount) {
        Instant start = Instant.now();
        try (executors) {
            for (int i = 0; i <= taskcount; i++) {
                executors.submit(() -> {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {

                    }
                });
            }
        }
        Instant finish = Instant.now();
        return Duration.between(start, finish).toMillis();
    }
}
