public class VirtualThreadEx {
    public static void main(String[] args) {

        // Platform Thread(os)
        Thread platformt = Thread.ofPlatform().unstarted(() -> {
            System.out.println("Platform thread " + Thread.currentThread());
        });
        platformt.start();
        platformt.setName("OS");

        // virtualThread(Jvm)->JEP 444(Project Loom)
        Thread virtualt = Thread.ofVirtual().unstarted(() -> {
            System.out.println("Virtual Thread " + Thread.currentThread());
        });
        virtualt.start();
        virtualt.setName("Glance");

        // 3.Creating 10000 Virtual Threads at glance<-fix limitations of platformthread
        try (var executor = java.util.concurrent.Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 10000; i++) {
                executor.submit(() -> {
                    // This creates 1000 virtual threads without crashing the JVM!
                });
            }
        }
    }
}