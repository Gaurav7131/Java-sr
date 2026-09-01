package CompletableFutureEx;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureTimeoutDemo {
    public static void main(String[] args) {
        // getpackage name
        System.out.println("Package name:" + CompletableFutureTimeoutDemo.class.getPackageName());

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (Exception ignore) {
            }
            return "Success";
        }).orTimeout(1, TimeUnit.SECONDS).exceptionally(ex -> "Timeout fallback!");

        System.out.println(future.join());

    }
}
