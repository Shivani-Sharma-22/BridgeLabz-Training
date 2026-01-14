
import java.util.Stack;

class MinStack{
	Stack<Integer> mainStack = new Stack<>();
	Stack<Integer> minSt = new Stack<>();
	
	void push(int x) {
		mainStack.push(x);
		if(minSt.isEmpty() || x <= minSt.peek()) {
			minSt.push(x);
		}
	}
	void pop() {
		if(mainStack.pop().equals(minSt.peek())) {
			minSt.pop();
		}
	}
	int getMin() {
		return minSt.peek();
	}
}
public class TrackMinMax {
	public static void main(String[] args) {
		MinStack st = new MinStack();
		st.push(10);
		st.push(5);
		st.push(20);
		
		System.out.println("Min: "+st.getMin());
		st.pop();
		System.out.println("Min: "+st.getMin());
		st.pop();
		System.out.println("Min: "+st.getMin());
	}
}
