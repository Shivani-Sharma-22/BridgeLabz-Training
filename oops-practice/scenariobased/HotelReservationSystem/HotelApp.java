package HotelReservationSystem;

public class HotelApp {
	public static void main(String[] args) {
		
		PricingStrategy seasonalPricing = new SeasonalPricing(1.2);
		// 2️ Create rooms
        Room deluxeRoom = new DeluxeRoom(101, seasonalPricing);
        Room standardRoom = new StandardRoom(102, seasonalPricing);
        // 3 create guest
        Guest guest1 = new Guest(1,"Shivam","Maholi Road near GokulDham Bhojnalya");
        Guest guest2 = new Guest(1,"uttam","Nand dwar bus stand Gokul, Mathura");
        
        // 4 Reservation
        Reservation reservation = new Reservation(101,guest2,deluxeRoom,2);
        Reservation reservation2 = new Reservation(102,guest1,standardRoom,5);
        try {
            // 5️ Confirm reservation
            reservation.confirmReservation();
            reservation2.confirmReservation();
            // 6️ Check-in
            reservation.checkIn();
            reservation2.checkIn();

            // 7️ Generate invoice
            reservation.generateInvoice();
            reservation2.generateInvoice();
            // 8️ Check-out
            reservation.checkOut();
            reservation2.checkOut();
            
        } catch (RoomNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
	}
}
