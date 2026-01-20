import java.util.Scanner;

// Abstract class
abstract class BankAccount {

    // immutable core data
    private final String accountNumber;
    private final double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // getters (no setters to keep immutability)
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // polymorphic method
    public abstract double calculateFee();
}

// SavingsAccount class
class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateFee() {
        // 0.5% of balance
        return getBalance() * 0.005;
    }
}

// CheckingAccount class
class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateFee() {
        // flat 1.0 fee if balance < 1000
        return getBalance() < 1000 ? 1.0 : 0.0;
    }
}

// Main class (user input)
public class BankApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account type (Savings / Checking):");
        String type = sc.nextLine();

        System.out.println("Enter account number:");
        String accNo = sc.nextLine();

        System.out.println("Enter balance:");
        double balance = sc.nextDouble();

        BankAccount account;

        if (type.equalsIgnoreCase("Savings")) {
            account = new SavingsAccount(accNo, balance);
        } else if (type.equalsIgnoreCase("Checking")) {
            account = new CheckingAccount(accNo, balance);
        } else {
            System.out.println("Invalid account type");
            return;
        }
        

        System.out.printf("Calculated Fee: %.2f%n", account.calculateFee());
    }
}
