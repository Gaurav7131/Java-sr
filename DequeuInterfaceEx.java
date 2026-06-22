import java.util.ArrayDeque;
import java.util.Deque;

public class DequeuInterfaceEx {

    public static void main(String[] args) {
        // ArrayDequeue for Dequeue
        Deque<String> q = new ArrayDeque<>();

        // Add elements using LIFo principles like Stack so sued push for adding we can
        // add/remove elements from any side regaring any strict rule

        q.push("Virat");// bottom
        q.push("Wrogn");
        q.push("Team 11");// Top

        System.out.println("Total" + q);
        // remove elements :Pop
        String s = q.pop();
        System.out.println("Queue:" + s); // removed element
    }
}
