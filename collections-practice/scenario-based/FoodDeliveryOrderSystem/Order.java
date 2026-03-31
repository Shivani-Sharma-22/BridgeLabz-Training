package FoodDeliveryOrderSystem;
import java.util.*;
public class Order {
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private int orderId;
    private String name;
    private String location;

    public Order(int orderId,String name,String location){
        this.location = location;
        this.orderId =orderId;
        this.name = name;
    }
}
