import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();

        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        System.out.println(stack.pop()); // C++
    }
}
