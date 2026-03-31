
public class PayCard implements Payment {

	@Override
	public void paymentType() {
		System.out.println("Card");
		
	}

	@Override
	public void pay(double amount) throws PaymentFailedException {
		if(amount< 0) {
			throw new PaymentFailedException("amount is invalid");
		}
		System.out.println("Payment done sucessfully.");
		
	}

}
