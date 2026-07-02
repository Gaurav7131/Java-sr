import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class Actionex extends RecursiveAction {
    int[] array;
    int start, end;

    // constuctor
    public Actionex(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    protected void compute() {
        // if task<3 move forward;else fork
        if (end - start <= 3) {
            for (int i = start; i < end; i++) {
                System.out.println(" processed " + array[i] + " by " + Thread.currentThread().getName());
            }
        } else {
            // chunk-fork
            int mid = start + (end - start) / 2;
            Actionex lefttask = new Actionex(array, start, mid);// imp
            Actionex righttask = new Actionex(array, mid, end);

            // join(merge)
            invokeAll(lefttask, righttask);
        }
    }

}

public class RecursiveActionEx {
    public static void main(String[] args) {
        int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        ForkJoinPool manager = new ForkJoinPool();

        // assign task to manager 0-9
        manager.invoke(new Actionex(data, 0, data.length));

        manager.shutdown();

    }
}