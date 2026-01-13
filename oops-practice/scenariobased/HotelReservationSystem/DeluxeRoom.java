package HotelReservationSystem;
public class DeluxeRoom extends Room {
    public DeluxeRoom(int roomNo, PricingStrategy pricingStrategy) {
        super(roomNo, 5000, pricingStrategy);
    }
}
