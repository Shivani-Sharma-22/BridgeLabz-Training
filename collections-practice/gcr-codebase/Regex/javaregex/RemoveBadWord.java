package javaregex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RemoveBadWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter text");
		String str = sc.nextLine();
		Pattern p = Pattern.compile("\\b(damn|stupid|idiot|bad)\\b", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(str);
		
		StringBuffer sb = new StringBuffer();
		while(m.find()) {
			String word = m.group();
			String star = "*".repeat(word.length());
			m.appendReplacement(sb, star);
		}
		m.appendTail(sb);
		System.out.println(sb.toString());
	}
}
