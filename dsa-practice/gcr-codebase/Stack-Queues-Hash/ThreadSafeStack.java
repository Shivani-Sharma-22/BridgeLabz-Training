import java.util.concurrent.ConcurrentLinkedDeque;

public class ThreadSafeStack {
	public static void main(String[] args) {
        ConcurrentLinkedDeque<Integer> stack = new ConcurrentLinkedDeque<>();

        stack.push(100);
        stack.push(200);

        System.out.println(stack.pop()); // 200
	}
}
