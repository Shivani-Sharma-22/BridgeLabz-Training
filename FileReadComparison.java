import java.io.*;

public class FileReadComparison {

    static void readUsingFileReader(String filePath) throws IOException {
        FileReader reader = new FileReader(filePath);
        int data;
        long start = System.nanoTime();

        while ((data = reader.read()) != -1) {
            // reading character by character
        }

        long time = System.nanoTime() - start;
        System.out.println("FileReader Time: " + time / 1_000_000.0 + " ms");
        reader.close();
    }

    static void readUsingInputStreamReader(String filePath) throws IOException {
        InputStreamReader reader =
                new InputStreamReader(new FileInputStream(filePath));
        char[] buffer = new char[8192];
        long start = System.nanoTime();

        while (reader.read(buffer) != -1) {
            // reading in chunks
        }

        long time = System.nanoTime() - start;
        System.out.println("InputStreamReader Time: " + time / 1_000_000.0 + " ms");
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        String filePath = "largefile.txt"; // test with 1MB, 100MB, 500MB

        readUsingFileReader(filePath);
        readUsingInputStreamReader(filePath);
    }
}
