import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

        queue.offer(1);
        queue.offer(2);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
