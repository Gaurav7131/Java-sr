import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Lockex {
    private int syncCount = 0;
    private int lockCount = 0;
    private Lock lock = new ReentrantLock();

    // using Synchronized(implicit(A/R))
    public synchronized void incrementSync() {
        syncCount++;
        System.out.println("incrementSync" + syncCount);
    }

    // using Lock Api(Explicit)
    public void incrementLock() {
        lock.lock();// manualy acquire lock
        try {
            lockCount++;
            System.out.println("incrementCount" + lockCount);
        } finally {
            lock.unlock();// unlock
        }
    }
}

public class SynchronizedVsLockEx {
    public static void main(String[] args) {
        Lockex l = new Lockex();
        l.incrementSync();

        l.incrementLock();

    }
}
