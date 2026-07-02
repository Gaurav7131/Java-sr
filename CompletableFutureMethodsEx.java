import java.util.concurrent.CompletableFuture;

public class CompletableFutureMethodsEx {
    public static void main(String[] args) throws Exception {
        // runAsync():return nothing(void)
        CompletableFuture<Void> task1 = CompletableFuture.runAsync(() -> {
            System.out.println("Task1 complete");

        });
        task1.join();

        // supplyAsync:return value
        CompletableFuture<String> task2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Task2 complete");
            return "Hot pizza";
        });
        System.out.println(" received " + task2.join()); // use join for o/p

        // complete():manual working "new"
        CompletableFuture<String> task3 = new CompletableFuture<>();
        task3.complete("Pizza already ready");
        System.out.println(" Received " + task3.join());
    }
}
