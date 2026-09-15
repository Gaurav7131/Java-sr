import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Java19FeatVirtualThreadEx {
    public static void main(String[] args) {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 100).forEach(i -> executor.submit(() -> {
                try {
                    Thread.sleep(100);// simulates blocking n/w/db latency
                    if (i == 0) {
                        System.out.println("Task Running:" + Thread.currentThread());
                    }
                } catch (InterruptedException e) {

                }
            }));
            // try-with resouces wait for virtual thread to complete its execution
            System.out.println("Task Execution Completed Successfully" + Thread.currentThread());

        }

    }
}
