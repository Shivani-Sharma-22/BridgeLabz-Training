import java.time.LocalDate;

class Order{
	int orderId;
	LocalDate orderDate;
	
	public Order(int orderId,LocalDate orderDate) {
		this.orderDate = orderDate;
		this.orderId = orderId;
	}
    public void getOrderStatus() {
    	System.out.println("Order-ID: "+orderId);
    	System.out.println("Order-Date: "+orderDate);
    }
}
class ShippedOrder extends Order{
	long trackingNumber;
	
	
	public ShippedOrder(int orderId,LocalDate orderDate,long trackingNumber) {
		super(orderId,orderDate);
		this.trackingNumber = trackingNumber;
		
	}
	public void getOrderStatus() {
		super.getOrderStatus();
		System.out.println("Tracking Number: "+trackingNumber);
	}
}
class DeliveredOrder extends ShippedOrder{
	LocalDate deliveryDate;
	
	public DeliveredOrder(int orderId, LocalDate orderDate, long trackingNumber,LocalDate deliveryDate) {
		super(orderId, orderDate, trackingNumber);
		this.deliveryDate = deliveryDate;
	}
	public void getOrderStatus() {
		super.getOrderStatus();
		System.out.println("Delivery Date: "+deliveryDate);
	}
	
}
public class RetailOrderManagement {
	public static void main(String[] args) {
		DeliveredOrder detail =new DeliveredOrder(12,
				LocalDate.of(2025, 1, 9)
				,23456789L,
				LocalDate.of(2025, 1, 23));
		detail.getOrderStatus();
		
	}
}
