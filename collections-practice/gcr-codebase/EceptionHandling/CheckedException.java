
import java.io.*;
public class CheckedException {
	public static void main(String[] args) {
		try {
			
            BufferedReader reader = new BufferedReader(new FileReader("/Users/apple/Desktop/BT/BridgeLabz-Training/collections-practice/gcr-codebase/EceptionHandling/source.txt"));
            String line;
            while((line = reader.readLine())!= null) {
            	System.out.println(line);
            }
           reader.close();
		}
		catch(IOException e){
			System.out.println("File not found");
		}
	}
}
