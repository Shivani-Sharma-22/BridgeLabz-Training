package javaregex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class FindEmail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Text");
		String text = sc.nextLine();
		Pattern p = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
		Matcher m = p.matcher(text);
		
		while(m.find()) {
			System.out.println(m.group());
		}
	}
}
