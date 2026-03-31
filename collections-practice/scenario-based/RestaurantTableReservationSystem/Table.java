package RestaurantTableReservationSystem;

class Table {
    int tableNo;
    boolean isReserved;

    public Table(int tableNo) {
        this.tableNo = tableNo;
        this.isReserved = false;
    }
}
