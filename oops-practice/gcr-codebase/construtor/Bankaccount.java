public class Bankaccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Bankaccount {

    void display() {
        System.out.println(accountNumber + " " + accountHolder);
    }

    // --- main method added here ---
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount();

        sa.accountNumber = 101;
        sa.accountHolder = "Shivani";
        sa.setBalance(5000.0);

        sa.display();
        System.out.println("Balance: " + sa.getBalance());
    }
}
