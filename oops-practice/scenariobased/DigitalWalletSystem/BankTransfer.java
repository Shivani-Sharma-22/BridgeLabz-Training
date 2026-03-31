package DigitalWalletSystem;

public class BankTransfer implements TransferService {

    @Override
    public void transfer(User from, User to, double amount)
            throws InsufficientBalanceException {

        double bankFee = 10;

        from.getWallet().withdrawMoney(amount + bankFee);
        to.getWallet().addMoney(amount);

        System.out.println("Bank transfer completed (₹10 fee applied)");
    }
}
