
public interface Payment {
	void paymentType();
	void pay(double amount) throws PaymentFailedException;
}
