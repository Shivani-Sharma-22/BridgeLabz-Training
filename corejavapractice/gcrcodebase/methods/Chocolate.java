package gcrcodebase.methods;

import java.util.*;
public class Chocolate {
	
	public static int[] findReaminChocolate(int numChoco,int numChild) {
		int perChild = numChoco/numChild;
		int remaining = numChoco % numChild;
		return new int[] {perChild,remaining};
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number of chocolate:");
		int numChoco = sc.nextInt();
		System.out.println("enter number of children:");
		int numChild = sc.nextInt();
		int[] result = findReaminChocolate(numChoco,numChild);
		
		System.out.println("Each Child will get; "+ result[0] + " The remaining chocolate: "+ result[1]);
	}
}
