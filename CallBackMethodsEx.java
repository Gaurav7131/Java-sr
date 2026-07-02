import java.util.concurrent.CompletableFuture;

public class CallBackMethodsEx {
    public static void main(String[] args) throws Exception {

        System.out.println("1. thenRun (Just execute something after):");
        CompletableFuture<Void> runFuture = CompletableFuture.supplyAsync(() -> "Pizza")
                .thenRun(() -> System.out.println("Pizza is ready! Let's clean the table."));
        runFuture.join();

        System.out.println("\n 2. thenCompose (Dependent Futures)");
        // Getting user, then getting their order (Order depends on User)
        CompletableFuture<String> composeFuture = CompletableFuture.supplyAsync(() -> "User123")
                .thenCompose(user -> CompletableFuture.supplyAsync(() -> user + "'s Margherita Pizza"));
        System.out.println("Compose Result: " + composeFuture.join());

        System.out.println("\n 3. thenCombine (Independent Futures Combined)");
        CompletableFuture<String> makePizza = CompletableFuture.supplyAsync(() -> "Hot Pizza ");
        CompletableFuture<String> getDrink = CompletableFuture.supplyAsync(() -> "Cold Coke ");

        // Both happen at the same time, combine when both finish
        CompletableFuture<String> comboMeal = makePizza.thenCombine(getDrink, (pizza, drink) -> {
            return "Enjoying " + pizza + " with " + drink;
        });
        System.out.println("Combine Result: " + comboMeal.join());

        System.out.println("\n 4. thenAcceptBoth (Consume both, return nothing)");
        CompletableFuture<Void> acceptBothFuture = makePizza.thenAcceptBoth(getDrink, (pizza, drink) -> {
            System.out.println("Eating " + pizza + " and drinking " + drink + " (No return value)");
        });
        acceptBothFuture.join();

        System.out.println("\n 5. allOf (Wait for all tasks to finish) ");
        CompletableFuture<String> task1 = CompletableFuture.supplyAsync(() -> "Task 1 Done");
        CompletableFuture<String> task2 = CompletableFuture.supplyAsync(() -> "Task 2 Done");
        CompletableFuture<String> task3 = CompletableFuture.supplyAsync(() -> "Task 3 Done");

        CompletableFuture<Void> allTasks = CompletableFuture.allOf(task1, task2, task3);
        allTasks.thenRun(() -> System.out.println("All friends have arrived! Cut the cake!")).join();

        System.out.println("\n 6. anyOf (Whichever finishes first) ");
        CompletableFuture<String> swiggy = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
            return "Swiggy Delivery";
        });
        CompletableFuture<String> zomato = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            } // Zomato is faster here beause of time
            return "Zomato Delivery";
        });

        CompletableFuture<Object> firstDelivery = CompletableFuture.anyOf(swiggy, zomato);
        System.out.println("First to arrive: " + firstDelivery.join());
    }
}