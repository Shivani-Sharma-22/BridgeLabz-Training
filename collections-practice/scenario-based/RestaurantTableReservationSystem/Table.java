package RestaurantTableReservationSystem;

class Table {
    int tableNo;
    private boolean isReserved;

    public Table(int tableNo) {
        this.tableNo = tableNo;
        this.setReserved(false);
    }

	public boolean isReserved() {
		return isReserved;
	}

	public void setReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}
}
