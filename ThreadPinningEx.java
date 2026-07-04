public class ThreadPinningEx {
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread.startVirtualThread(() -> {
            // PINNING A THREAD!
            synchronized (lock) {
                try {
                    System.out.println("Thread Pinned! Holding the OS thread...");
                    Thread.sleep(2000); // The Carrier OS thread is blocked here!
                } catch (InterruptedException e) {
                }
            }
        });
    }
}