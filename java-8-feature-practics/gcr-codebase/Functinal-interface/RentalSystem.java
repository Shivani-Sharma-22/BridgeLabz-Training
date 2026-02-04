// Interface
interface VehicleRental {
    void rent();
    void returnVehicle();
}

// Car
class Car implements VehicleRental {
    public void rent() {
        System.out.println("Car has been rented");
    }

    public void returnVehicle() {
        System.out.println("Car has been returned");
    }
}

// Bike
class Bike implements VehicleRental {
    public void rent() {
        System.out.println("Bike has been rented");
    }

    public void returnVehicle() {
        System.out.println("Bike has been returned");
    }
}

// Bus
class Bus implements VehicleRental {
    public void rent() {
        System.out.println("Bus has been rented");
    }

    public void returnVehicle() {
        System.out.println("Bus has been returned");
    }
}

// Test
public class RentalSystem {
    public static void main(String[] args) {
        VehicleRental v1 = new Car();
        VehicleRental v2 = new Bike();
        VehicleRental v3 = new Bus();

        v1.rent();
        v2.rent();
        v3.rent();

        v1.returnVehicle();
        v2.returnVehicle();
        v3.returnVehicle();
    }
}
