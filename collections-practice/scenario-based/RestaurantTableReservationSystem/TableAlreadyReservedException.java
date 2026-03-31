package RestaurantTableReservationSystem;

class TableAlreadyReservedException extends Exception {
    public TableAlreadyReservedException(String msg) {
        super(msg);
    }
}

