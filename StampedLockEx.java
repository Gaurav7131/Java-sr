import java.util.concurrent.locks.StampedLock;

public class StampedLockEx {
    private double x = 0.0, y = 0.0;
    private final StampedLock sl = new StampedLock();

    // 1. Write Operation
    public void move(double deltaX, double deltaY) {
        long stamp = sl.writeLock(); // exclusive write
        try {
            x += deltaX;
            y += deltaY;
            System.out.println(Thread.currentThread().getName() + " moved to: " + x + ", " + y);
        } finally {
            sl.unlockWrite(stamp);
        }
    }

    // 2. Optimistic Read
    public double distanceFromOrigin() {
        //
        long stamp = sl.tryOptimisticRead();

        double currentX = x;
        double currentY = y;

        // check whether write happened during reading
        if (!sl.validate(stamp)) {
            System.out.println(
                    Thread.currentThread().getName() + " -> Oops! Data changed while reading. Using normal Read Lock.");

            // happened fallback return to traditional read
            stamp = sl.readLock();
            try {
                currentX = x;
                currentY = y;
            } finally {
                sl.unlockRead(stamp);
            }
        } else {
            System.out.println(
                    Thread.currentThread().getName() + " -> Optimistic Read successful! No one changed the data.");
        }
        return Math.sqrt(currentX * currentX + currentY * currentY);
    }

    public static void main(String[] args) {
        StampedLockEx magic = new StampedLockEx();

        // Thread 1: (Reader)
        Thread reader = new Thread(() -> {
            magic.distanceFromOrigin();
        }, "Reader-Thread");

        // Thread 2:(Writer)
        Thread writer = new Thread(() -> {
            magic.move(10.0, 20.0);
        }, "Writer-Thread");

        reader.start();
        writer.start();
    }
}