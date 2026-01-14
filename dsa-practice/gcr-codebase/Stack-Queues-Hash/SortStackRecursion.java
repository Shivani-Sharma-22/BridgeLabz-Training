import java.util.Stack;

public class SortStackRecursion {
	static void sortStack(Stack<Integer> st) {
		if(!st.isEmpty()) {
			int top = st.pop();
			sortStack(st);
			insertSorted(st,top);
		}
	}

	private static void insertSorted(Stack<Integer> st, int value) {
		if (st.isEmpty() || value > st.peek()) {
            st.push(value);
            return;
        }
		int top = st.pop();
        insertSorted(st, value);
        st.push(top);
	}

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(30);
        stack.push(10);
        stack.push(20);

        sortStack(stack);

        System.out.println("Sorted Stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
