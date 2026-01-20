public class FibonacciComparison {

    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] values = {10, 30, 50};

        for (int n : values) {
            System.out.println("\nFibonacci(" + n + ")");

            if (n <= 30) { // recursion becomes infeasible beyond this
                long start = System.nanoTime();
                fibonacciRecursive(n);
                long time = System.nanoTime() - start;
                System.out.println("Recursive: " + time / 1_000_000.0 + " ms");
            } else {
                System.out.println("Recursive: Unfeasible");
            }

            long start = System.nanoTime();
            fibonacciIterative(n);
            long time = System.nanoTime() - start;
            System.out.println("Iterative: " + time / 1_000_000.0 + " ms");
        }
    }
}
