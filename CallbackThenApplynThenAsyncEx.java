import java.util.concurrent.CompletableFuture;

public class CallbackThenApplynThenAsyncEx {
    public static void main(String[] args) {
        System.out.println("Main Thread:" + Thread.currentThread().getName());

        CompletableFuture<String> task1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Made By:");
            return "Hot piza";

        }).thenApply(food -> {
            // 2.handled by prev.thread
            System.out.println(" Complements " + Thread.currentThread().getName());
            return "cheese";
        }).thenApplyAsync(food -> {
            // handle by other thread
            System.out.println(" Delievred by " + Thread.currentThread().getName());
            return "Order Delieved";
        });

        System.out.println(" Final " + task1.join());
    }
}
