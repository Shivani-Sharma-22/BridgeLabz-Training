// Superclass
class BankAccount5 {
    String accountNumber;
    double balance;

    BankAccount5(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

// Savings Account
class SavingsAccount2 extends BankAccount5 {
    double interestRate;

    public SavingsAccount2(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Checking Account
class CheckingAccount extends BankAccount5 {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}

// Fixed Deposit Account
class FixedDepositAccount extends BankAccount5 {
    int maturityPeriod;

    FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}

public class BankSystem {
    public static void main(String[] args) {

        BankAccount5 acc1 = new SavingsAccount2("SA123", 50000, 3.5);
        BankAccount5 acc2 = new CheckingAccount("CA456", 30000, 10000);
        BankAccount5 acc3 = new FixedDepositAccount("FD789", 100000, 12);

        acc1.displayAccountInfo();
        System.out.println();

        acc2.displayAccountInfo();
        System.out.println();

        acc3.displayAccountInfo();
    }
}
