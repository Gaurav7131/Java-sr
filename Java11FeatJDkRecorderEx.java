
//JEP 328:JDk FLight Recorded:internal blackbox of jdk
import jdk.jfr.Event;
import jdk.jfr.Label;
import jdk.jfr.Name;

public class Java11FeatJDkRecorderEx {
    @Name("com.demo.order")
    @Label("Order Placed Event")
    static class OrderPlacedEvent extends Event {
        Long orderId;
        Double amount;

        // Methods of OrderPlacedEvent
        public void orderId(Long orderId) {
            System.out.println("OrderID:" + orderId);
        }

        public void amount(Double amount) {
            System.out.println("Amount:" + amount);
        }
    }

    public static void main(String[] args) {
        OrderPlacedEvent event = new OrderPlacedEvent();
        event.orderId(101L);
        event.amount(100.0);

        event.begin();
        event.commit();// write low-lvel overhead to jfr ring buffer
        System.out.println("JDK Flight Recorded");

    }
}