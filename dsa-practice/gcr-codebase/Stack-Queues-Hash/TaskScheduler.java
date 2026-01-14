import java.util.LinkedList;
import java.util.Queue;

public class TaskScheduler {
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList<>();

        tasks.offer("Login Task");
        tasks.offer("Payment Task");
        tasks.offer("Logout Task");

        while (!tasks.isEmpty()) {
            System.out.println("Processing: " + tasks.poll());
        }
    }
}
