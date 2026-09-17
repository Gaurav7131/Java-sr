
import java.util.concurrent.StructuredTaskScope;
import java.util.concurrent.StructuredTaskScope.Subtask;

public class Java21FeatScopedValueStructuredConcurrencyEx {
    // ScopedValueA lightweight, immutable alternative to ThreadLocal that shares
    // bounded,read-only data across tasks without memory leaks.
    public static final ScopedValue<String> traced_id = ScopedValue.newInstance();

    static String fetchOrder() throws InterruptedException {
        return "Order Fetched with Trace Id:" + traced_id.get();
    }

    static String fetchPayment() throws InterruptedException {
        return "Payment Done";
    }

    public static void main(String[] args) {
        // StructuredTaskScope:Atomic ops
        ScopedValue.where(traced_id, "TXN_1232").run(() -> {
            try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
                Subtask<String> order_info = scope.fork(() -> fetchOrder());
                Subtask<String> pay_receipt = scope.fork(() -> fetchPayment());

                scope.join();// wait for other subtask to finished
                scope.throwIfFailed();// ifany 1 subtask failed,+cancelled subquent further task

                System.out.println(order_info.get() + "|" + pay_receipt.state());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }

}
