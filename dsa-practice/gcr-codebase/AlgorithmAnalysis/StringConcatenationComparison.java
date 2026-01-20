public class StringConcatenationComparison {

    static void usingString(int n) {
        String s = "";
        long start = System.nanoTime();

        for (int i = 0; i < n; i++) {
            s = s + "a";
        }

        long time = System.nanoTime() - start;
        System.out.println("String (" + n + "): " + time / 1_000_000.0 + " ms");
    }

    static void usingStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        long start = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sb.append("a");
        }

        long time = System.nanoTime() - start;
        System.out.println("StringBuilder (" + n + "): " + time / 1_000_000.0 + " ms");
    }

    static void usingStringBuffer(int n) {
        StringBuffer sb = new StringBuffer();
        long start = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sb.append("a");
        }

        long time = System.nanoTime() - start;
        System.out.println("StringBuffer (" + n + "): " + time / 1_000_000.0 + " ms");
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1_000_000};

        for (int size : sizes) {
            System.out.println("\nOperations: " + size);
            usingString(size);
            usingStringBuilder(size);
            usingStringBuffer(size);
        }
    }
}
