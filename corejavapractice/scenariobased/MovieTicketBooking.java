package scenariobased;

import java.util.*;
public class MovieTicketBooking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter your choice");
			System.out.println("1.Gold  2.Platinum  3.Silver  4.Snacks");
			int choice = sc.nextInt();
			
			if(choice == 0) {
				System.out.println("Exit");
				
				return;
			}
			switch(choice) {
			case 1:
				System.out.println("Gold ticket is confirmed.");
				break;
			case 2:
				System.out.println("Platinum ticket is confirmed.");
				break;
			
			case 3:
				System.out.println("Silver ticket is confirmed.");
				break;
			case 4:
				System.out.println("Which Snacks do you want?.");
				String snack = sc.nextLine();
				break;
			default:
				System.out.println("invalid Type.");
			}
				
			
		}
	}
}
