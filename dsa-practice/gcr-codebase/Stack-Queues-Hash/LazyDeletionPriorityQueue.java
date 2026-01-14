import java.util.PriorityQueue;
import java.util.HashSet;

public class LazyDeletionPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashSet<Integer> deleted = new HashSet<>();

        pq.offer(15);
        pq.offer(10);
        pq.offer(20);

        // Mark 10 as deleted (lazy deletion)
        deleted.add(10);

        while (!pq.isEmpty()) {
            int val = pq.poll();
            if (!deleted.contains(val)) {
                System.out.println("Processed: " + val);
                break;
            }
        }
    }
}
