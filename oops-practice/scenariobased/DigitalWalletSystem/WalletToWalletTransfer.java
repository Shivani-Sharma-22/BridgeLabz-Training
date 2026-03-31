package DigitalWalletSystem;

public class WalletToWalletTransfer implements TransferService {

    @Override
    public void transfer(User from, User to, double amount)
            throws InsufficientBalanceException {

        from.getWallet().withdrawMoney(amount);
        to.getWallet().addMoney(amount);

        from.getWallet().addTransaction(
                new Transaction("TRANSFER TO " + to.getName(), amount)
        );
        to.getWallet().addTransaction(
                new Transaction("RECEIVED FROM " + from.getName(), amount)
        );

        System.out.println("Wallet transfer successful");
    }
}
