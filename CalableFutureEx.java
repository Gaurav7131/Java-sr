import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CalableFutureEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService manager = Executors.newSingleThreadExecutor();// single thread

        // callable wants pizza
        Callable<String> pizzaCallable = () -> {
            Thread.sleep(2000);
            return "Hot pizza";
        };

        Future<String> token = manager.submit(pizzaCallable);
        System.out.println("Chating with frds");

        String pizza = token.get();
        System.out.println("Pizza order placed:" + pizza);

        manager.shutdown();
    }
}
