import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class Actionex extends RecursiveTask<Integer> {
    int[] array;
    int start, end;

    // constructor
    public Actionex(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    // RecursiveTasK<V>:return something so Integer(wrapper classtype)
    @Override
    protected Integer compute() {
        if (end - start <= 3) {
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            return sum;
        } else {
            // chunk
            int mid = start + (end - start) / 2;
            Actionex leftex = new Actionex(array, start, mid);
            Actionex righex = new Actionex(array, mid, end);

            // fork:first task add to pool
            leftex.fork();

            // compute:secondtask on own compute
            int rightresult = righex.compute();

            // join(merge)
            int leftresult = leftex.join();

            return leftresult + rightresult;
        }

    }
}

public class RecursiveTaskEx {
    public static void main(String[] args) {
        int[] data = { 10, 20, 30, 40 };
        ForkJoinPool manager = new ForkJoinPool();

        int total = manager.invoke(new Actionex(data, 0, data.length));

        System.out.println("Total:" + total);

        manager.shutdown();
    }
}
