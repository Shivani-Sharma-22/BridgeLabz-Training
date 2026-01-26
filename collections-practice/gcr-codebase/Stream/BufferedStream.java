import java.io.*;

public class BufferedStream {

    public static void main(String[] args) {

        String sourceFile = "sourceFile.txt";
        String normalDest = "normalCopy.txt";
        String bufferedDest = "bufferedCopy.txt";

        int bufferSize = 4096; // 4 KB

        // Create 100MB test file
        System.out.println("Creating a 100MB test file... please wait.");
        byte[] dummyData = new byte[1024 * 1024]; // 1MB block

        try (FileOutputStream fos = new FileOutputStream(sourceFile)) {
            for (int i = 0; i < 100; i++) {
                fos.write(dummyData);
            }
        } catch (IOException e) {
            System.out.println("Error creating test file: " + e.getMessage());
            return;
        }

        // Normal File Streams
        long start = System.nanoTime();
        copyNormal(sourceFile, normalDest, bufferSize);
        long end = System.nanoTime();
        System.out.println("Normal FileStream took: " + (end - start) / 1_000_000 + " ms");

        // Buffered Streams
        start = System.nanoTime();
        copyBuffered(sourceFile, bufferedDest, bufferSize);
        end = System.nanoTime();
        System.out.println("Buffered Stream took: " + (end - start) / 1_000_000 + " ms");
    }

    static void copyNormal(String source, String dest, int size) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[size];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error in normal copy: " + e.getMessage());
        }
    }

    static void copyBuffered(String source, String dest, int size) {
        try (BufferedInputStream bis =
                     new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos =
                     new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] buffer = new byte[size];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error in buffered copy: " + e.getMessage());
        }
    }
}
