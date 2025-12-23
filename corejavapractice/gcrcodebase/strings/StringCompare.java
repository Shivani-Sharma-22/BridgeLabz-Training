package gcrcodebase.strings;

import java.util.Scanner;

public class StringCompare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		if(str1.length() != str2.length()) {
			System.out.println("String are not equals:");
			return;
		}
		
		for(int i =0;i<str1.length();i++) {
			if(str1.charAt(i) != str2.charAt(i)) {
				System.out.println("String are not equals:");
			}
		}
		System.out.println("String are equals");
		sc.close();
	}

}
