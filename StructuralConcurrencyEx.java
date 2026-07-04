
import java.util.concurrent.StructuredTaskScope;

public class StructuralConcurrencyEx {

    public static void main(String[] args) {

        // 1. Creating and Running a simple Virtual Thread
        Thread vThread = Thread.ofVirtual().start(() -> {
            System.out.println("Hello from Virtual Thread! " + Thread.currentThread());
        });

        try {
            vThread.join(); // Wait for it to finish
            System.out.println("\n--- Starting Parallel Tasks ---");
            fetchDataConcurrently();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 2. Parallel Task Execution using Structured Concurrency
    @SuppressWarnings("preview")
    static void fetchDataConcurrently() throws InterruptedException {
        // ShutdownOnFailure means if one task fails, cancel the others!
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {

            // Forking tasks (They automatically run on Virtual Threads)
            StructuredTaskScope.Subtask<String> userTask = scope.fork(() -> fetchUser());
            StructuredTaskScope.Subtask<String> orderTask = scope.fork(() -> fetchOrder());

            scope.join(); // Wait for both to finish (or one to fail)
            scope.throwIfFailed(); // Throw exception if any task failed

            // If we reach here, both succeeded!
            System.out.println("Success! " + userTask.get() + " | " + orderTask.get());

        } catch (Exception e) {
            System.out.println("Operation failed: " + e.getMessage());
        }
    }

    static String fetchUser() throws InterruptedException {
        Thread.sleep(1000); // Simulating DB call
        return "User: Rahul";
    }

    static String fetchOrder() throws InterruptedException {
        Thread.sleep(1000); // Simulating DB call
        return "Order: iPhone 15";
    }
}