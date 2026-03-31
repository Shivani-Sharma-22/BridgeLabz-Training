package javaregex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractLinks {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the text:");
		String text = s.nextLine();
		
		Pattern p = Pattern.compile("(https?://)?(www\\.)?[A-Za-z0-9.-]+\\.[a-z]{2,}(/[A-Za-z0-9?=&.-]*)?");
		Matcher m = p.matcher(text);
		
		while(m.find()) {
			System.out.print(m.group()+", ");
		}
	}

}
