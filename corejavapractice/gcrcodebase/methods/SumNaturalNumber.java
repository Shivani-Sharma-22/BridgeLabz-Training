package gcrcodebase.methods;

import java.util.*;
public class SumNaturalNumber {
	
	public static int sumOfNatural(int n) {
		int sum =0;
		if(n > 0) {
		
		for(int i =0;i<n;i++) {
			sum  = n*(n + 1)/2;
		}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//taking input 
		System.out.println("enter the number:");
		int n = sc.nextInt();
		System.out.println(sumOfNatural(n));
	}
}
