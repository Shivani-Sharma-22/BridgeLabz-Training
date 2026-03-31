
public class PayWallet implements Payment {

	@Override
	public void paymentType() {
		System.out.println("Payment Type is Wallet");
		
	}

	@Override
	public void pay(double amount) throws PaymentFailedException {
		if(amount < 0) {
			throw new PaymentFailedException("amount is invalid");
		}
		System.out.println("Payment sucessfull using Upi.");
	}
	
}
