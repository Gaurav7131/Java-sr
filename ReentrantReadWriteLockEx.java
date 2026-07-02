import java.util.concurrent.locks.*;

class ReentrantLockEx {
    private int sharedData = 10;
    private ReadWriteLock rw = new ReentrantReadWriteLock();

    // write
    public void write(int value) {
        rw.writeLock().lock();
        try {
            System.out.println("Writing " + Thread.currentThread().getName() + value);
            sharedData = value;
        } finally {
            rw.writeLock().unlock();
        }
    }

    // Read lock
    public int read() {
        rw.readLock().lock();
        try {
            System.out.println("Reading " + Thread.currentThread().getName() + sharedData);
            return sharedData;// read SharedData:10
        } finally {
            rw.readLock().unlock();
        }
    }
}

public class ReentrantReadWriteLockEx {
    public static void main(String[] args) throws Exception {
        ReentrantLockEx ex = new ReentrantLockEx();

        System.out.println(ex.read());

        ex.write(12);// write:12

    }
}
