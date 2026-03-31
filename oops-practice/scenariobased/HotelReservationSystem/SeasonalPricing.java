package HotelReservationSystem;

public class SeasonalPricing implements PricingStrategy {

    private double seasonalMultiplier;

    public SeasonalPricing(double seasonalMultiplier) {
        this.seasonalMultiplier = seasonalMultiplier;
    }

    @Override
    public double calculatePrice(double basePrice) {
        return basePrice * seasonalMultiplier;
    }
}
