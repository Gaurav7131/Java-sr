import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Random;

public class LivelockEx {
    // 2 locks
    static Lock lock1 = new ReentrantLock();
    static Lock lock2 = new ReentrantLock();
    static Random random = new Random();

    public static void main(String[] args) {
        // thread(2)
        Thread t1 = new Thread(() -> tryToWork(lock1, lock2, "Thread-1"));
        Thread t2 = new Thread(() -> tryToWork(lock2, lock1, "Thread-2"));// trick lock_pos

        t1.start();
        t2.start();
    }

    static void tryToWork(Lock firstLock, Lock secondLock, String name) {
        while (true) {
            // lock
            firstLock.lock();
            System.out.println(name + " locked first lock.");

            // 2.check next side(tryLock)
            if (secondLock.tryLock()) {
                try {
                    System.out.println(name + "got both locks! Work Done");
                    break; // work done
                } finally {
                    secondLock.unlock();
                }
            } else {
                // 3.dont get second lock,release firstlock
                System.out.println(name + " couldn't get second lock. Releasing first lock to be politely.");
                firstLock.unlock();

                // ४. Livelock FIX: (Random Sleep)
                try {
                    int sleepTime = random.nextInt(50); // 0-50 mls
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
