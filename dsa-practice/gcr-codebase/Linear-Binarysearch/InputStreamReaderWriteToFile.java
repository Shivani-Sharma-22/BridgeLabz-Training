import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputStreamReaderWriteToFile {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter("output.txt", true)) {

            String line;
            System.out.println("Enter text (type 'exit' to quit):");
            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                fw.write(line + System.lineSeparator());
            }

            System.out.println("Input saved to output.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
