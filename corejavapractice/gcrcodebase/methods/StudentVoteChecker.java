package gcrcodebase.methods;

import java.util.*;
public class StudentVoteChecker {
	public static boolean canVote(int age) {
		return age >= 18;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] age = new int[10];
		for(int i =0;i<age.length;i++) {
			System.out.print("Enter age of student " + (i + 1) + ": ");
			age[i] =sc.nextInt();
		}
		
		for(int i =0;i<age.length;i++) {
			System.out.println("Student " + (i + 1) + ": " + (canVote(age[i]) ? "Can Vote" : "Cannot Vote"));      
		}
	}
}
