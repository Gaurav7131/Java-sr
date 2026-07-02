import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditioninLockEx {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean dataReady = false;

    public void waitForData() {
        lock.lock();
        try {
            while (!dataReady) {
                System.out.println(Thread.currentThread().getName() + ": Waiting for data...");
                condition.await(); // Waits and releases lock temporarily
            }
            System.out.println(Thread.currentThread().getName() + ": Data processed!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void prepareData() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + ": Preparing data...");
            dataReady = true;
            condition.signal(); // Wakes up the waiting thread
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ConditioninLockEx example = new ConditioninLockEx();

        // Create the Consumer thread that waits for data
        Thread consumer = new Thread(() -> {
            example.waitForData();
        }, "ConsumerThread");

        // Create the Producer thread that prepares data
        Thread producer = new Thread(() -> {
            try {
                // Sleep for 2 seconds to guarantee the Consumer thread hits await() first
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            example.prepareData();
        }, "ProducerThread");

        // Start both threads
        consumer.start();
        producer.start();
    }
}