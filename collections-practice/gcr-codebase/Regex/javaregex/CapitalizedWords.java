package javaregex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CapitalizedWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text:");
		String text = sc.nextLine();
		Pattern p = Pattern.compile("[A-Z][A-Za-z]+");
		Matcher m = p.matcher(text);
		
		while(m.find()) {
			System.out.print(m.group()+",");
		}
	}
}
