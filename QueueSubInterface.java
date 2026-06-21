import java.util.LinkedList;
import java.util.Queue;

public class QueueSubInterface {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.add("Virat");
        q.add("Rohit");
        q.add("MSD");

        System.out.println("Total Queue:" + q);

        // poll:remove first e from FRONT FIFO
        q.poll();
        System.out.println("Poll:" + q);

        // Add to END
        q.offer("Tilak");
        System.out.println("offer:" + q);
    }
}
