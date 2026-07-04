public class VirtualThreadVsBlockingNonBlockingEx {
    public static void main(String[] args) throws InterruptedException {
        // We start 10,000 virtual threads doing "Blocking I/O" (sleep)
        for (int i = 0; i < 10_000; i++) {
            Thread.startVirtualThread(() -> {
                try {
                    // Simulating Blocking I/O (e.g., DB call)
                    Thread.sleep(1000);
                    System.out.println("Data fetched by: " + Thread.currentThread());
                } catch (InterruptedException e) {
                }
            });
        }
        Thread.sleep(2000); // Wait for all to finish
    }
}