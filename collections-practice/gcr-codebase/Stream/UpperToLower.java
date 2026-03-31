import java.io.*;

public class UpperToLower {

    public static void main(String[] args) {

        String sourceFile = "collections-practice/gcr-codebase/Stream/source.txt";
        String destinationFile = "collections-practice/gcr-codebase/Stream/destination.txt";

        try (
            BufferedReader br = new BufferedReader(
                    new FileReader(sourceFile)
            );
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter(destinationFile)
            );
        ) {
            String line;

            while ((line = br.readLine()) != null) {
                bw.write(line.toLowerCase());
                bw.newLine();
            }

            System.out.println("File converted from UPPERCASE to lowercase successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
