package FoodDeliveryOrderSystem;

import java.util.Scanner;

public class FoodDeliveryApp {
    public static void main(String[] args) throws NoAgentAvailableException {
        Scanner sc = new Scanner(System.in);
        DeliveryService service = new DeliveryService();

        service.addAgent(new Agent("Rahul",12,true));
        service.addAgent(new Agent("Shiva",13,true));

        service.placeOrder(new Order(101, "Pizza", "Delhi"));
        service.placeOrder(new Order(102, "Burger", "Noida"));

        try {
            service.assignDelivery();
            service.assignDelivery();
            service.assignDelivery();
        } catch (NoAgentAvailableException e) {
            System.out.println(e.getMessage());
        }
        service.viewActiveDeliveries();
        service.cancelDelivery(102);
        service.viewActiveDeliveries();

    }
}
