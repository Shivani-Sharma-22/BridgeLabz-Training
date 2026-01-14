class CircularQueue {
    int[] queue;
    int front, rear, size, capacity;

    CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        size = 0;
        rear = -1;
    }

    void enqueue(int data) {
        if (size == capacity) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
    }

    int dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int data = queue[front];
        front = (front + 1) % capacity;
        size--;
        return data;
    }
}

public class CircularQueueDemo {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(3);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        System.out.println(cq.dequeue());
        cq.enqueue(40);
        System.out.println(cq.dequeue());
    }
}
