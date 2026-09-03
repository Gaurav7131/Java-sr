public class OrderPlacedEvent {
    public void orderId(Long id) {
        System.out.println("Order id" + id);
    }

    public void amount(Double amount) {
        System.out.println("Amount:" + amount);
    }

    public static void main(String[] args) {

    }
}
