package javaregex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DatesExtact {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the text:");
		String text = s.nextLine();
		
		Pattern p = Pattern.compile("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}");
		Matcher m = p.matcher(text);
		
		while(m.find()) {
			System.out.print(m.group()+",");
		}
	}
}
