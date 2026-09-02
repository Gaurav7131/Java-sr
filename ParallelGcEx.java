public class ParallelGcEx {

    // Method simulating parallel Full GC action (introduced in Java 10 via JEP 307)
    public void parallelFullGarbageCollection(int workerThreads) {
        System.out.println("Starting G1 Parallel Full GC using " + workerThreads + " worker threads...");
        // In Java 10+, all available GC threads clean the heap concurrently
        System.out.println("Heap cleaned successfully Stop-the-world pause minimized.");
    }

    // Method containing the decision logic
    public void checkAndTriggerGC(boolean heapAllocationFails, boolean concurrentCollectionCannotKeepUp) {
        if (heapAllocationFails && concurrentCollectionCannotKeepUp) {
            // Before Java 10: handled by a single thread (serial), causing latency spikes
            // Java 10+ (JEP 307): Uses parallel worker threads matching CPU cores
            int workerThreads = Runtime.getRuntime().availableProcessors();
            parallelFullGarbageCollection(workerThreads);
        } else {
            System.out.println("G1 GC running standard young,mixed collections. No Full GC required.");
        }
    }

    public static void main(String[] args) {
        ParallelGcEx gcDemo = new ParallelGcEx();

        System.out.println("Scenario 1: Normal Allocation ---");
        gcDemo.checkAndTriggerGC(false, false);

        System.out.println("\n Scenario 2: Severe Allocation Failure & Full GC ---");
        gcDemo.checkAndTriggerGC(true, true);
    }
}