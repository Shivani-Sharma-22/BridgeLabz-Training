import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Task 1");
        queue.offer("Task 2");
        queue.offer("Task 3");

        while (!queue.isEmpty()) {
            System.out.println("Processing: " + queue.poll());
        }
    }
}


