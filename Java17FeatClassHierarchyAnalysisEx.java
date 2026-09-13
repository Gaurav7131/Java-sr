public class Java17FeatClassHierarchyAnalysisEx {
    /*
     * New Class Hierarchy Analysis(NCHA):JIT compiler chekcs whether their is only
     * one impl. of interface or asbtact method.If so if devirtulizes-converting
     * expensive direct dispatch into inlinable m/c call.Avoid premature
     * deoptimization.
     */
    public interface Worker {
        void compute();// abstract method has no body
    }

    // Monomorphic call target site(only 1 impl)
    static class FastWorker implements Worker {
        public void compute() {

            int x = 3 * 2;
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Worker w = new FastWorker();
        // JIT compiler warms up and triggered Devirtulization convert expensise direct
        // dispatchinto simple inlineable m/c call.
        for (int i = 0; i < 3; i++) {
            w.compute();
        }
        System.out.println("CHA devirtulization Completed");
    }
}