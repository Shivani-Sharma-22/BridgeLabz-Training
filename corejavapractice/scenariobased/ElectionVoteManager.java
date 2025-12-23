package scenariobased;

import java.util.*;
public class ElectionVoteManager {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		
		if(age<18) {
			System.out.println("You cannot vote");
			return;
		}
		
		while(true) {
			
			System.out.println("\n--- Voting Menu ---");
            System.out.println("1. Narendra Modi (BJP)");
            System.out.println("2. Rahul Gandhi (INC)");
            System.out.println("3. Arvind Kejriwal (AAP)");
            System.out.println("4. NOTA");
            
            System.out.println("Enter your choice:");
            int val = sc.nextInt();
            
		switch(val) {
		case 1:
	        System.out.println("You voted for: Narendra Modi (Party: BJP)");
	        break;

	    case 2:
	        System.out.println("You voted for: Rahul Gandhi (Party: INC)");
	        break;

	    case 3:
	        System.out.println("You voted for: Suresh Yadav (Party: AAP)");
	        break;

	    case 4:
	        System.out.println("You selected: NOTA (None of the Above)");
	        break;

	    default:
	        System.out.println("Invalid choice! Please vote carefully.");
	        continue;
		}
		System.out.println("Thank you for voting");
	        
		System.out.println("Do you want to vote again ?Type Yes or No");
		String voteAgain=sc.next();
		if(voteAgain.equalsIgnoreCase("No")) {
			System.out.println("Voting session end");
			System.out.println("Have a nice day...");
			break;
		}
		}
		
		
	}

}

