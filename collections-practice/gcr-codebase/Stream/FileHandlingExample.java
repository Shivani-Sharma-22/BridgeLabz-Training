import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingExample {

    public static void main(String[] args) {

        try {
            // Write content to source.txt
            FileOutputStream sourceOut = new FileOutputStream("source.txt");
            String data = "Name: Shivani Sharma\n" +
                    "Course: Java Programming\n" +
                    "Topic: File Handling";;
            sourceOut.write(data.getBytes());
            sourceOut.close();

            // Read source.txt
            FileInputStream fis = new FileInputStream("source.txt");

            // Write to destination.txt
            FileOutputStream fos = new FileOutputStream("destination.txt");

            int ch;
            while ((ch = fis.read()) != -1) {
                fos.write(ch);
            }

            fis.close();
            fos.close();

            System.out.println("Copy successful!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
