public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        int n = 1000000;
        StringBuffer sb = new StringBuffer();
        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime - startTime) + " ns");

        StringBuilder sbl = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sbl.append("hello");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime) + " ns");
    }
}
