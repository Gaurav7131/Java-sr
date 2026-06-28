import java.util.concurrent.TimeUnit;

class Waiter extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Working step " + i);

                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Someone interrupted me! Stopping gracefully...");
                    return;
                }
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {

            System.out.println("I was sleeping and got interrupted! (Exception)" + e);
            // when excetion occured interrupt flag=false;
        }
    }
}

public class InterruptFlag {
    public static void main(String[] args) throws InterruptedException {
        Waiter w = new Waiter();
        w.start();

        TimeUnit.SECONDS.sleep(2);

        System.out.println("Main thread interrupting the worker");
        w.interrupt();

    }

}
