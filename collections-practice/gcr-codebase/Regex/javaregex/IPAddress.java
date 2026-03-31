package javaregex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class IPAddress {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the IP Address");
		String ip = sc.nextLine();
		String regex =
	            "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}" +
	                    "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(ip);
		
		if (m.matches()) {
            System.out.println("Valid IP Address");
        } else {
            System.out.println("Invalid IP Address");
        }
	}
}
