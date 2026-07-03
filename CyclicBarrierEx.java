import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierEx {

    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cb = new CyclicBarrier(3, () -> {
            System.out.println("Lets go for a trip");
        });

        Runnable task = (() -> {
            try {
                System.out.println(Thread.currentThread().getName() + " reached to the station");
                cb.await();// wait for others
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        });

        new Thread(task, "Frd1").start();
        new Thread(task, "frd2").start();
        new Thread(task, "Frd3").start();

    }
}