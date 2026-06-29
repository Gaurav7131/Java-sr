import java.util.concurrent.locks.ReentrantLock;

class Mutex {
    ReentrantLock lock = new ReentrantLock();// mutex(key)

    public void doWork() {
        System.out.println(Thread.currentThread().getName());// current working threadname
        lock.lock();// lock acuired
        {
            try {
                System.out.println("Working safely");
            } finally {
                lock.unlock();// always
                System.out.println("Unlock");
            }
        }
    }
}

public class MutexReentrant {
    public static void main(String[] args) {
        Mutex m = new Mutex();

        Thread t1 = new Thread(() -> {
            m.doWork();

        });

        Thread t2 = new Thread(() -> {
            m.doWork();
        });

        t1.start();
        t2.start();
    }
}
