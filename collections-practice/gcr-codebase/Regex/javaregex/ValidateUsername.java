package javaregex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidateUsername {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the username:");
		String name = sc.next();
		
		Pattern p = Pattern.compile("^[a-zA-Z0-9_]{5,12}$");
		Matcher m = p.matcher(name);
		
		if(m.find()) {
			System.out.println("valid Username");
		}
		else {
			System.out.println("Invalid username!");
		}
			
		
	}
}
