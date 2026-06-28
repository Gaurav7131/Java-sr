public class DaemonEx {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            while (true) { // Infinite loop
                System.out.println("Daemon is cleaning in background...");
            }
        });

        daemonThread.setDaemon(true); // Must be set BEFORE start()
        daemonThread.start();

        System.out.println("Main (User) Thread finished. JVM will exit now!");
        // Once main finishes, JVM kills the infinite daemon thread immediately
    }
}
