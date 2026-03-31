package HotelReservationSystem;

public class Reservation {
	private int reservationID;
    private Guest guest;
    private Room room;
    private int stayDays;
    private double totalBill;
    private boolean checkedIn;
    private boolean checkedOut;
    
    public Reservation(int reservationID, Guest guest, Room room, int stayDays) {
        this.reservationID = reservationID;
        this.guest = guest;
        this.room = room;
        this.stayDays = stayDays;
        this.checkedIn = false;
        this.checkedOut = false;
    }

	public Room getRoom() {
		return room;
	}

	public Guest getGuest() {
		return guest;
	}

	public int getReservationID() {
		return reservationID;
	}

	public int getDuration() {
		return stayDays;
	}
	public double getBilling() {
		return totalBill;
	}

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public boolean isCheckedOut() {
		return checkedOut;
	}
	 // Confirm reservation
    public void confirmReservation() throws RoomNotAvailableException {
        if (!room.isIsavailable()) {
            throw new RoomNotAvailableException("Room not available");
        }
        totalBill = room.calculatePrice() * stayDays;
        System.out.println("Reservation confirmed. Total Bill: ₹" + totalBill);
    }
 // Check-in
    public void checkIn() {
        room.checkIn();
        checkedIn = true;
        System.out.println("Guest checked in.");
    }
 // Check-out
    public void checkOut() {
        room.checkOut();
        checkedOut = true;
        System.out.println("Guest checked out.");
    }
    // Generate invoice
    public void generateInvoice() {
        System.out.println("------ INVOICE ------");
        System.out.println("Reservation ID: " + reservationID);
        System.out.println("Guest: " + guest.getGuestName());
        System.out.println("Room No: " + room.getRoomNo());
        System.out.println("Stay Days: " + stayDays);
        System.out.println("Total Amount: ₹" + totalBill);
        System.out.println("---------------------");
    }
	

}
