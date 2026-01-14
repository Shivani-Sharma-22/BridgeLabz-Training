class FixQueue{
	int[] queue;
	int front = 0;
	int rare = -1;
	int size = 0,capacity;
	
	FixQueue(int capacity){
		this.capacity = capacity;
		queue = new int[capacity];
	}
	void enqueue(int data) {
		if(size == capacity) {
			System.out.println("Queue Overflow");
            return;
		}
	}
	void dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println("Removed: " + queue[front++]);
        size--;
    } 
}
public class QueueOverflowUnderflow {
	public static void main(String[] args) {
		FixQueue q = new FixQueue(3);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30); // Overflow

        q.dequeue();
        q.dequeue();
        q.dequeue();   // Underflow
	}
}
