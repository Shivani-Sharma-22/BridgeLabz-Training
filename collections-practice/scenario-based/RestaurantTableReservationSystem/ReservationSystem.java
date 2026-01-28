
package RestaurantTableReservationSystem;
import java.util.*;
public class ReservationSystem  {
	HashMap<Integer, Table> tables = new HashMap<>();private String name;
	
	public ReservationSystem(int totalTables) {
        for(int i=1; i<=totalTables; i++) {
            tables.put(i, new Table(i));
        }
    }
	//Reservation
	public void reserveTable(int tableno)throws TableAlreadyReservedException {
		Table t = tables.get(tableno);
		
		if(t == null) {
			System.out.println("Invalid table no.");
			return;
		}
		if(t.isReserved()) {
			throw new TableAlreadyReservedException("Table already reserved!");
		}
		t.setReserved(true);
		System.out.println("Table "+tableno+" Reserved successfully.");
	}
	//Cancel Reservation
	public void cancelReservation(int tableno) {
		Table t = tables.get(tableno);
		if(t == null || !t.isReserved()) {
			System.out.println("No active reservation found.");
			return;
		}
		t.setReserved(false);
		System.out.println("Reservation cancelled for table: "+tableno);
	}
    public void showAvailableTables(){
    	System.out.println("Available Tables:");
    	for(Table t:tables.values()) {
    		if(!t.isReserved()) {
    			System.out.println(t.tableNo+" ");
    		}
    	}
    	System.out.println();
    }
	public void exit(int i) {
		System.out.println("Thank you visit again...");
		
	}
}
