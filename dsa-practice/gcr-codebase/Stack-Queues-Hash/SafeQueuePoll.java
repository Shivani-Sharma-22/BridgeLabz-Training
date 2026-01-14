import java.util.LinkedList;
import java.util.Queue;

public class SafeQueuePoll {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        if (!queue.isEmpty()) {
            System.out.println(queue.poll());
        } else {
            System.out.println("Queue is empty, cannot dequeue");
        }

        queue.offer(100);

        if (!queue.isEmpty()) {
            System.out.println("Removed: " + queue.poll());
        }
    }
}
