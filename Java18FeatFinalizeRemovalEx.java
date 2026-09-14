public class Java18FeatFinalizeRemovalEx implements AutoCloseable {
    public void execute() {
        System.out.println("Resources processing");
    }

    @Override
    public void close() {
        System.out.println("Resources freed up deterministically");
    }

    public static void main(String[] args) {
        // java 18:finalize removal due to memory leaks,gc latency spikes
        // Approach:try with resources with AutoCloseable
        try (var resource = new Java18FeatFinalizeRemovalEx()) {
            resource.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
