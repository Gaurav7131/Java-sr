import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueInterfaceEx {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();

        q.offer(15);// bottom
        q.offer(50);
        q.offer(1);// top VIP ->PriorityQueue

        System.out.println("Total:" + q);

        System.out.println("VIP:" + q.poll());// 1
        System.out.println("VIP:" + q.poll());// 15
    }
}
