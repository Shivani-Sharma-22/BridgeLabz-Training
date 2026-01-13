package HotelReservationSystem;

public class Guest {
	private int guestId;
	private String guestName;
	private String address;
	
	public Guest(int guestId,String guestName,String address) {
		this.setGuestId(guestId);
		this.setGuestName(guestName);
		this.setAddress(address);
	}

	public int getGuestId() {
		return guestId;
	}

	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public void getDetails() {
		System.out.println("Guest ID: "+getGuestId());
		System.out.println("Guest Name: "+getGuestName());
		System.out.println("Guest Address: "+getAddress());
	}
}
