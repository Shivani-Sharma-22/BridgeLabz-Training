class FixedStack {
    int[] stack;
    int top;
    int size;

    FixedStack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }
}

public class StackOverflowUnderflow {
    public static void main(String[] args) {
        FixedStack s = new FixedStack(2);

        s.push(10);
        s.push(20);
        s.push(30); // Overflow

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop()); // Underflow
    }
}
