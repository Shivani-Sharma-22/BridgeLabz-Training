
public class Main {
	public static void main(String[] args) {
		Product p1 = new Product("Mouse",12,2000);
		Product p2 = new Product("Laptop",103,120000);
		Product p3 = new Product("Phone",102,200000);
		
		//create customer 
		Customer c1 = new Customer(102,"Deepak");
		
		//order 
		Order o1 = new Order(112,c1,p2);
		
		Payment paymentMethod = new PayUpi();
		try {
			paymentMethod.pay(o1.product.prodPrice);
		}
		catch(PaymentFailedException e){
			System.out.println("Payment Failed-"+ e.getMessage());
		}
		//product
		p2.display();
		//order 
		o1.trackOrder();
//		o1.cancelOrder();
	}
}
