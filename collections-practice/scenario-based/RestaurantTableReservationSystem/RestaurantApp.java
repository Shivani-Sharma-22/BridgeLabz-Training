package RestaurantTableReservationSystem;
import java.util.*;
public class RestaurantApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ReservationSystem system = new ReservationSystem(10);

        while(true) {
            System.out.println("\n1. Reserve Table");
            System.out.println("2. Cancel Reservation");
            System.out.println("3. Show Available Tables");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            try {
                switch(ch) {
                    case 1:
                        System.out.print("Enter table number: ");
                        system.reserveTable(sc.nextInt());
                        break;

                    case 2:
                        System.out.print("Enter table number: ");
                        system.cancelReservation(sc.nextInt());
                        break;

                    case 3:
                        system.showAvailableTables();
                        break;

                    case 4:
                        System.exit(0);
                }
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

