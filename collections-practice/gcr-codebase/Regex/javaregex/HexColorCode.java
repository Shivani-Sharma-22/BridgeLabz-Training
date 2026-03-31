package javaregex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class HexColorCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Hex color code");
		Pattern p = Pattern.compile("^[#]{1}[0-9A-Fa-f]{6}$");
		Matcher m = p.matcher(sc.next());
		if(m.find()) {
			System.out.println("Valid");
		}else {
		System.out.println("invalid");
		}
	}
}
