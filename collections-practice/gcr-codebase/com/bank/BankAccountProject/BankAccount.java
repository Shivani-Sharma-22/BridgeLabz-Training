package com.bank.BankAccountProject;

public class BankAccount {
	private double balance;
	private String holderName;
	private String accNumber;
	
	public BankAccount(double balance,String holderName,String accNumber) {
		this.setBalance(balance);
		this.setHolderName(holderName);
		this.setAccNumber(accNumber);
	}
	
	public void deposit(double amount) {
		if(amount<0) {
			throw new IllegalArgumentException("Deposit amount cannot be negative");
		}
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(amount > balance) {
			throw new IllegalArgumentException("Insufficient funds.");
		}
		balance -= amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
}
