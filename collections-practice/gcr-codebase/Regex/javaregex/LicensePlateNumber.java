package javaregex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class LicensePlateNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the License Number.");
		Pattern p = Pattern.compile("^[A-Z]{2}[0-9]{4}$");
		Matcher m = p.matcher(sc.next());
		if(m.find()) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
	}
}
