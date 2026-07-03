import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);// 3 frds

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + "Pressed buttons");
            latch.countDown();// Decrease count by 1
        };

        new Thread(task, "Fr1").start();
        new Thread(task, "Frd2").start();
        new Thread(task, "Frd3").start();

        System.out.println("Waiting for 3 buttons");
        latch.await();// Main thread waits until count is 0
        System.out.println("Take off");
    }
}