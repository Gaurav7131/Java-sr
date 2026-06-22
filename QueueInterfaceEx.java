import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceEx {
    public static void main(String[] args) {
        // we Used Linkedlist for creating Queue
        Queue<String> q = new LinkedList<>();

        // we used offer/add to add elements in Queue
        q.offer("Virat");
        q.offer("Tilak");

        // remove elements from queue:from only one side i.e from rear(back) FIFO
        String s = q.poll();
        System.out.println("Queue:" + s);
    }
}
