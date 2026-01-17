import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileReadByFileReader {
    public static void main(String[] args) {
        // This is a placeholder for file reading logic using FileReader.
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}