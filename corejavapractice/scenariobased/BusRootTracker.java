package scenariobased;

import java.util.*;
public class BusRootTracker {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalDistance = 0;
		while(true) {
			
			System.out.println("do you want to get off  ? Type Yes or No");
			String travelAgain=sc.next();
			if(travelAgain.equalsIgnoreCase("Yes")) {
				break;
			}
			else {
				totalDistance += 2;
			}
		}
		System.out.println("total distance travel is: "+ totalDistance);
	}
}
