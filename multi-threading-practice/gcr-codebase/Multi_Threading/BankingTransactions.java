package Multi_Threading;

import java.time.*;

class BankAccount {
    int balance = 10000;

    synchronized void withdraw(String name, int amount) {
        System.out.println("[" + name + "] Attempting " + amount);
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Success : " + name + " " + amount + " Balance : " + balance + " " + LocalTime.now());
        } else {
            System.out.println("Failed : " + name);
        }
    }
}

class Transaction implements Runnable {
    BankAccount acc;
    String name;
    int amt;

    Transaction(BankAccount acc, String name, int amt) {
        this.acc = acc;
        this.name = name;
        this.amt = amt;
    }

    public void run() {
        acc.withdraw(name, amt);
    }
}

public class BankingTransactions {
    public static void main(String[] args) {
        BankAccount bankAcc = new BankAccount();
        new Thread(new Transaction(bankAcc,"Customer-1",3000)).start();
        new Thread(new Transaction(bankAcc,"Customer-2",4000)).start();
        new Thread(new Transaction(bankAcc,"Customer-3",2000)).start();
        new Thread(new Transaction(bankAcc,"Customer-4",5000)).start();
        new Thread(new Transaction(bankAcc,"Customer-5",1500)).start();
    }
}
