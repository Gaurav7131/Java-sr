import java.util.concurrent.StructuredTaskScope;
import java.util.concurrent.StructuredTaskScope.Subtask;

public class Java21FeatStructuredConcurrencyEx {
    public static void main(String[] args) {
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            Subtask<String> task1 = scope.fork(() -> "User's Credentials");
            Subtask<String> task2 = scope.fork(() -> "Account's Credentials ");

            scope.join();// wait for other subtask to complete its execution
            scope.throwIfFailed();// atomic ops if 1 subtask gets interrupted all shutdown
            System.out.println("Task1:" + task1.get() + "||" + task2.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
