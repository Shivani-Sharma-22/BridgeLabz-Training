package RestaurantTableReservationSystem;
import java.util.*;
class ReservationSystem {
    HashMap<Integer, Table> tables = new HashMap<>();

    public ReservationSystem(int totalTables) {
        for(int i=1; i<=totalTables; i++) {
            tables.put(i, new Table(i));
        }
    }

    public void reserveTable(int tableNo) throws TableAlreadyReservedException {
        Table t = tables.get(tableNo);

        if(t == null) {
            System.out.println("Invalid table number.");
            return;
        }

        if(t.isReserved) {
            throw new TableAlreadyReservedException("Table already reserved!");
        }

        t.isReserved = true;
        System.out.println("Table " + tableNo + " reserved successfully.");
    }

    public void cancelReservation(int tableNo) {
        Table t = tables.get(tableNo);

        if(t == null || !t.isReserved) {
            System.out.println("No active reservation found.");
            return;
        }

        t.isReserved = false;
        System.out.println("Reservation cancelled for table " + tableNo);
    }

    public void showAvailableTables() {
        System.out.println("Available Tables:");
        for(Table t : tables.values()) {
            if(!t.isReserved) {
                System.out.print(t.tableNo + " ");
            }
        }
        System.out.println();
    }
}

