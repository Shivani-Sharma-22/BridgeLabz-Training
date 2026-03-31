package gcrcodebase.functions;

import java.util.*;
public class NaturalNumberLevel02 {
	public static int sumOfNumberRecurrsive(int num) {
		if(num == 0) {
			return 0;
		}
		return num+ sumOfNumberRecurrsive(num-1);
	}
	public static int sumOfNumber(int num) {
		if(num == 0) {
			return 0;
		}
		int sum = num*(num+1)/2;
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the N Number");
		int num = sc.nextInt();
		System.out.println(sumOfNumber(num) == sumOfNumberRecurrsive(num));
	}
}
