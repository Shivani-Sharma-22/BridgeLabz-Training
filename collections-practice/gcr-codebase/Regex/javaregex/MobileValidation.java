package javaregex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MobileValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mobile number.");
		String mob = sc.next();
		
		Pattern p = Pattern.compile("^[6-9][0-9]{9}$");
		Matcher m = p.matcher(mob);
		
		System.out.println(m.find());
	}
}

