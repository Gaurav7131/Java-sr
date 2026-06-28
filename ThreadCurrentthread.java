import java.util.concurrent.TimeUnit;

class Waiter extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Current Working Thread");
        // try-catch because timeUnit needs to handle InterruptedException
        try {
            TimeUnit.SECONDS.sleep(3);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "Finished Working Thread");
    }
}

public class ThreadCurrentthread {
    public static void main(String[] args) throws InterruptedException {
        Waiter w = new Waiter();
        w.start();
        w.setName("Shyam");

        System.out.println("Manager waiting for Shyam to complete his task");
        // wait for main thread
        w.join();

        System.out.println("Shyam complteted his task now manager can goto home!");

    }

}
