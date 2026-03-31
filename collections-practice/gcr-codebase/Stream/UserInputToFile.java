import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputToFile {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer = null;

        try {
            // Read user input
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // Write data to file
            writer = new FileWriter("userDetails.txt");
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + language + "\n");

            System.out.println("User details saved successfully.");

        } catch (IOException e) {
            System.out.println("Input/Output error occurred.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid age entered.");
        } finally {
            try {
                if (writer != null)
                    writer.close();
                reader.close();
            } catch (IOException e) {
                System.out.println("Error closing resources.");
            }
        }
    }
}
