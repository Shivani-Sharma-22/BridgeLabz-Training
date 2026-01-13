package HotelReservationSystem;

public class StandardRoom extends Room{
	public StandardRoom(int roomNo, PricingStrategy pricingStrategy) {
        super(roomNo,6000, pricingStrategy);
    }
}
