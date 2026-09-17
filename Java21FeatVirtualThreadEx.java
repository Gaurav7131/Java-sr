import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Java21FeatVirtualThreadEx {
    public static void main(String[] args) {
        // spawns 100 task concurrenly without chocking os resources
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 100).forEach(i -> executor.submit(() -> {
                try {
                    Thread.sleep(1000);// virtual thread blockig i/o(db call,http request)
                    if (i == 0) {
                        System.out.println("Running on:" + Thread.currentThread());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }));
            System.out.println("Virtual Thread Execution Finished:" + Thread.currentThread());
        }
    }
}