import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class PerformanceChallenge {
    public static void main(String[] args) {
        int n = 1000000;
        String sample = "hello";

        // StringBuilder
        StringBuilder sb = new StringBuilder();
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb.append(sample);
        }
        long end = System.nanoTime();
        System.out.println("StringBuilder time: " + (end - start) + " ns");

        // StringBuffer
        StringBuffer sbuf = new StringBuffer();
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sbuf.append(sample);
        }
        end = System.nanoTime();
        System.out.println("StringBuffer time: " + (end - start) + " ns");

        // FileReader word count
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            long wordCount = 0;
            long frStart = System.nanoTime();
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            long frEnd = System.nanoTime();
            System.out.println("FileReader word count: " + wordCount);
            System.out.println("FileReader time: " + (frEnd - frStart) + " ns");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // InputStreamReader word count
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("largefile.txt"), "UTF-8"))) {
            String line;
            long wordCount = 0;
            long isrStart = System.nanoTime();
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            long isrEnd = System.nanoTime();
            System.out.println("InputStreamReader word count: " + wordCount);
            System.out.println("InputStreamReader time: " + (isrEnd - isrStart) + " ns");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
