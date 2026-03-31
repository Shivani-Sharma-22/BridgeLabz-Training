
public class Order {
	int orderId;
	Customer customer;
	Product product;
	boolean isCancelled = false;
	
	public Order(int orderId,Customer customer,Product product) {
		this.orderId =orderId;
		this.customer = customer;
		this.product = product;
	}
	public void cancelOrder() {
		isCancelled = true;
		System.out.println("Order "+ orderId +"is cancel sucessfully.");
	}
	public void trackOrder() {
		if(isCancelled) {
			System.out.println("Order "+ orderId +"is cancel sucessfully.");
		}
		else {
			System.out.println("Order "+ orderId + " is on the way.");
		}
	}
}
