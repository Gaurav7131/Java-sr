public class ParkUnparkDemo {
    public static void main(String[] args) throws InterruptedException {

        Runnable task = () -> {
            System.out.println("Start - Thread: " + Thread.currentThread());

            try {
                // Here the magic happens! JVM PARKS (unmounts) the virtual thread.
                // The underlying OS Carrier thread is NOT blocked. It goes to do other work.
                Thread.sleep(2000);

                // After 2 seconds, JVM UNPARKS (mounts) the virtual thread.
                // Notice the Carrier thread name might have changed!
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("End - Thread: " + Thread.currentThread());
            Thread.currentThread().setName("Ram");// sometimes main thread(carrier thread-name get altered thats why)
        };

        // Run the task using a Virtual Thread
        Thread vThread = Thread.ofVirtual().start(task);
        vThread.join(); // Wait for it to finish
    }
}