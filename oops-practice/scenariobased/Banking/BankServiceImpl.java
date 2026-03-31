package Banking;

public class BankServiceImpl implements BankService {

    @Override
    public void transfer(Account from, Account to, double amount) {
        synchronized (this) {
            try {
                from.withdraw(amount);
                to.deposit(amount);
                System.out.println("Transferred ₹" + amount + " successfully");
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
