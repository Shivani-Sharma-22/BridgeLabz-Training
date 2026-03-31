import java.util.*;
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class BankAccount{
	private double balance;
	private int accNo;
	
	public BankAccount(int accNo,double balance) {
		this.accNo=accNo;
		this.balance=balance;
	}

	public double getBalance() {
		return balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void withdraw(double amount) throws InsufficientBalanceException{
		if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        balance = balance - amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
		
	}
}
public class BankTransactionSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount acc = new BankAccount(101, 5000);
		try {
			System.out.println("Enter withdrawal amount:");
            double amount = sc.nextDouble();
            acc.withdraw(amount);
		}
		catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
		catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
	}

}
