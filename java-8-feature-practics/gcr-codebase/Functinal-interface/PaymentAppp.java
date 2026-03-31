interface PaymentProcessor {

    void processPayment(double amount);

    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed");
    }
}

class UpiPayment implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("UPI payment of ₹" + amount + " successful");
    }
}

public class PaymentAppp {
    public static void main(String[] args) {
        PaymentProcessor p = new UpiPayment();
        p.processPayment(1000);
        p.refund(500);
    }
}
