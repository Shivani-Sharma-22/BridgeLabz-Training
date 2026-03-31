package Banking;

public class BankingApp {

    public static void main(String[] args) {

        Account acc1 = new SavingsAccount(101, "Shivani", 5000);
        Account acc2 = new CurrentAccount(102, "Amit", 3000);

        BankService bankService = new BankServiceImpl();

        // Multithreading: concurrent transactions
        Thread t1 = new Thread(() -> bankService.transfer(acc1, acc2, 2000));
        Thread t2 = new Thread(() -> bankService.transfer(acc1, acc2, 4000));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nFinal Balance:");
        System.out.println("Shivani: ₹" + acc1.getBalance());
        System.out.println("Amit: ₹" + acc2.getBalance());

        System.out.println("\nTransaction History (Shivani):");
        acc1.printTransactions();
    }
}
