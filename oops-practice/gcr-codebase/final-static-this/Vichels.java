
public class Vichels {
	static double registrationFee = 500.0;

    final String registrationNumber;
    String ownerName;
    String vehicleType;
    
    Vichels(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    void displayVehicle() {
        System.out.println(
            "Owner: " + ownerName +
            ", Type: " + vehicleType +
            ", Reg No: " + registrationNumber +
            ", Registration Fee: ₹" + registrationFee
        );
    }
 //  main method
    public static void main(String[] args) {
    	Vichels v1 = new Vichels("Amit", "Car", "UP32AB1234");
    	Vichels v2 = new Vichels("Neha", "Bike", "UP32XY5678");
    	Vichels v3 = new Vichels("Rahul", "Truck", "UP32TR9999");

        System.out.println("Before Fee Update:");
        v1.displayVehicle();
        v2.displayVehicle();
        v3.displayVehicle();

        // update static registration fee
        Vehicle.updateRegistrationFee(750.0);

        System.out.println("\nAfter Fee Update:");
        v1.displayVehicle();
        v2.displayVehicle();
        v3.displayVehicle();
    }

}
