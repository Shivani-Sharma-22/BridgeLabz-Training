package DigitalWalletSystem;

import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private double balance;
    private List<Transaction> transactions = new ArrayList<>();

    public void addMoney(double amount) {
        balance += amount;
        transactions.add(new Transaction("ADD", amount));
        System.out.println("Money added: ₹" + amount);
    }

    public void withdrawMoney(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance");
        }
        balance -= amount;
        transactions.add(new Transaction("WITHDRAW", amount));
        System.out.println("Money withdrawn: ₹" + amount);
    }

    public double getBalance() {
        return balance;
    }

    public void addTransaction(Transaction tx) {
        transactions.add(tx);
    }

    public void showTransactions() {
        System.out.println("Transaction History:");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}
