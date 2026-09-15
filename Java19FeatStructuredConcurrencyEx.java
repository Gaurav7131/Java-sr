
import java.util.concurrent.StructuredTaskScope;
import java.util.concurrent.StructuredTaskScope.Subtask;

public class Java19FeatStructuredConcurrencyEx {
    static String fetchedUserData() throws InterruptedException {
        Thread.sleep(100);
        return "User Data";
    }

    static String fetchedOrderData() throws InterruptedException {
        Thread.sleep(150);
        return "Order Data";
    }

    public static void main(String[] args) {
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            Subtask<String> usFuture = scope.fork(() -> fetchedUserData());
            Subtask<String> orderFuture = scope.fork(() -> fetchedOrderData());

            scope.join();// wait for all task to complete their execution
            scope.throwIfFailed();// propagate exception if any threw exception

            System.out.println("Fetched user Data:" + usFuture + "\nFetched Recent Order data:" + orderFuture);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
