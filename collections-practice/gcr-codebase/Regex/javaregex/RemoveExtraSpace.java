package javaregex;
import java.util.*;
import java.util.regex.Pattern;
public class RemoveExtraSpace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text:");
		String str = sc.nextLine();
		System.out.println(str.replaceAll("\\s+", " "));
		
	}

}
