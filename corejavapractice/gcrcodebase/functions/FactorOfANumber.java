package gcrcodebase.functions;

import java.util.*;
public class FactorOfANumber {
	public static int[] factorOfNum(int num) {
		int count  =0;
		for(int i =1;i<=num;i++) {
			if(num % i == 0) {
				count++;
			}
		}
		int index =0;
		int[] factor = new int[count];
		for(int i =1;i<=num;i++) {
			if(num % i == 0) {
				factor[index] = i;
				index++;
			}
		}
		return factor;
	}
	public static int sumOfFactor(int[] result) {
		int sum = 0;
		for(int i =0;i<result.length;i++) {
			sum += result[i];
		}
		return sum;
	}
	public static int productOfFactor(int[] result) {
		int product = 1;
		for(int i =0;i<result.length;i++) {
			product *= result[i];
		}
		return product;
	}
	public static double sumOfSqrOfFactor(int[] result) {
		double sumOfSqr = 0;
		for(int i =0;i<result.length;i++) {
			sumOfSqr = Math.pow(result[i], 2);
		}
		return sumOfSqr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int[] result = factorOfNum(num);
		for(int i =0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		System.out.println("Sum of factor "+sumOfFactor(result));
		System.out.println("Product of factor "+productOfFactor(result));
		System.out.println("Sum of square of factor "+sumOfSqrOfFactor(result));
		
	}
}
