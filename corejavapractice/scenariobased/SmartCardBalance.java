package scenariobased;

import java.util.*;
public class SmartCardBalance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//fixed amount 
		 int  balance = 300;
		
		while(true) {
			System.out.println("Current balance :"+balance);
			
			System.out.println("Enter the distance(km) ");
			int distance = sc.nextInt();
			
			//cal fare
			int fare = (distance > 5)?20:40;
			
			//check dsduction
			if(balance < fare) {
				System.out.println("Insufficient balance. Please recharge. ");
				break;
			}
			
			balance = balance - fare;
			System.out.println("Fare deducted: ₹" + fare);
			System.out.println("Current balance: "+balance);
			
			System.out.println("Do you want to travel again? (Yes/No)");
            String continueTravel = sc.next();
			if(continueTravel.equalsIgnoreCase("No")) {
				System.out.println("Thank you for using Delhi Metro Smart Card.");
				break;
			}
			
		}
		
		
	}
}
