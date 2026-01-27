import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class TryWithResources {
	public static void main(String[] args) {
		
		try(BufferedReader reader = new BufferedReader(new FileReader("source.txt"))){
			
			String firstLine = reader.readLine();;
			if(firstLine != null) {
				System.out.println(firstLine);
			}
			else {
				System.out.println("File is Empty.");
			}
		}
		catch(IOException e) {
			System.out.println("Error: reading file ");
		}
	}
}
