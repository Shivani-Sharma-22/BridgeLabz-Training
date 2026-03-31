package HotelReservationSystem;

public abstract class Room {
	private int roomNo;
	private double basePrice;
	private boolean isAvailable;
	protected PricingStrategy pricingStrategy;
	
	public Room(int roomNo, double basePrice,PricingStrategy pricingStrategy) {
		this.basePrice = basePrice;
		this.roomNo = roomNo;
		this.pricingStrategy = pricingStrategy;
        this.isAvailable = true;
	}

	public int getRoomNo() {
		return roomNo;
	}


	public double getBasePrice() {
		return basePrice;
	}

	public boolean isIsavailable() {
		return isAvailable;
	}
	
	public void roomAvailable() {
		isAvailable = true;
		System.out.println("Room is Available");
	}
	public int roomNumber() {
		return getRoomNo();
	}
	public void checkIn() {
        isAvailable = false;
        System.out.println("Room " + roomNo + " checked in.");
    }
	public void checkOut() {
        isAvailable = true;
        System.out.println("Room " + roomNo + " checked out.");
    }
	// POLYMORPHISM via Strategy
    public double calculatePrice() {
        return pricingStrategy.calculatePrice(basePrice);
    }
}
