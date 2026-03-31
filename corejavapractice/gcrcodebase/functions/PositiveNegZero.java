package gcrcodebase.functions;

import java.util.*;
public class PositiveNegZero {
	static String posNegZero(int num) {
		if(num < 0) {
			return "Negative";
		}
		else if(num == 0) {
			return "Zero";
		}
		return "Positive";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//taking number as input 
		System.out.println("Eneter the number:");
		int num = sc.nextInt();
		System.out.println(posNegZero(num));
		
	}
}
