package leetcode;
import java.util.LinkedList;
import java.util.Queue;

class MyStack{
	Queue<Integer> q;
	
	public MyStack() {
		q=new LinkedList<>();
	}
	public void push(int x) {
		q.offer(x);
		int size = q.size();
		for(int i =1;i<size;i++) {
			q.offer(q.poll());
		}
	}
	public int pop() {
		return q.poll();
	}
	 int peek() {
		return q.peek();
	}
	 boolean empty() {
		 return q.isEmpty();
	 }
}
 
public class ImplementStackUsingQueue {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.empty());
	}
}

