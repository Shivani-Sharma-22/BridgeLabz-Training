package com.bank.BankAccountProject;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BankAccountTest {

    @Test
    public void testDepositValidAmount() {
        BankAccount account = new BankAccount(1000, "Shivani", "ACC123");
        account.deposit(500);
        assertEquals(1500, account.getBalance(), 0.0);
    }

    @Test
    public void testDepositNegativeAmount() {
        BankAccount account = new BankAccount(1000, "Shivani", "ACC123");
        try {
            account.deposit(-200);
        } catch (IllegalArgumentException e) {
            assertEquals("Deposit amount cannot be negative", e.getMessage());
        }
    }

    @Test
    public void testWithdrawValidAmount() {
        BankAccount account = new BankAccount(1000, "Shivani", "ACC123");
        account.withdraw(400);
        assertEquals(600, account.getBalance(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount(500, "Shivani", "ACC123");
        account.withdraw(800);
    }

}
