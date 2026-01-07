package Banking;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    protected int accountNumber;
    protected String holderName;
    protected double balance;
    protected List<Transaction> transactions = new ArrayList<>();

    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction("DEPOSIT", amount));
    }

    public synchronized void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        transactions.add(new Transaction("WITHDRAW", amount));
    }

    public double getBalance() {
        return balance;
    }

    public abstract double calculateInterest();

    public void printTransactions() {
        transactions.forEach(System.out::println);
    }
}
