package gcrcodebase.functions;

import java.util.*;
public class MaximumNumberHandshake {
	
	static int maximumHandshake(int numberOfStudent) {
		return (numberOfStudent *(numberOfStudent-1))/2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//input no. of student
		System.out.println("Enetr the number of student: ");
		int numberOfStudent = sc.nextInt();
		
		System.out.println("The number of possible handshakes are: "+ maximumHandshake(numberOfStudent));
		
	}
}
