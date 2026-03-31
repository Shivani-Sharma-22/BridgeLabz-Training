package DigitalWalletSystem;

public class WalletApp {

    public static void main(String[] args) {

        User u1 = new User(1, "Shivani");
        User u2 = new User(2, "Aman");

        u1.getWallet().addMoney(5000);

        TransferService walletTransfer = new WalletToWalletTransfer();
        TransferService bankTransfer = new BankTransfer();

        try {
            walletTransfer.transfer(u1, u2, 1000);
            bankTransfer.transfer(u1, u2, 500);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nShivani Balance: ₹" + u1.getWallet().getBalance());
        System.out.println("Aman Balance: ₹" + u2.getWallet().getBalance());

        u1.getWallet().showTransactions();
    }
}
