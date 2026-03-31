package RestaurantTableReservationSystem;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ReservationSystem rs = new ReservationSystem(5);
		while(true) {
			System.out.println("1.Reserve Table");
			System.out.println("2.Cancel Reservation");
			System.out.println("3.Show Available table");
			System.out.println("4.Exit");
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();
		
		try {
			switch(choice) {
			case 1:
				System.out.println("Enter table number");
			    rs.reserveTable(sc.nextInt());
			    break;
			    
			case 2:
				System.out.println("Enter the table number");
				rs.cancelReservation(sc.nextInt());
				break;
			case 3:
				rs.showAvailableTables();
				break;
			case 4:
				rs.exit(0);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
}
