import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        // spy1:Thread1
        new Thread(() -> {
            try {
                String myitem = "Red bag";
                System.out.println("Spy1 has " + myitem);
                String received = exchanger.exchange(myitem);
                System.out.println("Spy1 received:" + received);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        // Thread2:Spy2
        new Thread(() -> {
            try {
                String myitem = "blue bag";
                System.out.println("Spy2 has:" + myitem);
                String receive = exchanger.exchange(myitem);
                System.out.println("Spy2 Received:" + receive);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }).start();

    }
}
