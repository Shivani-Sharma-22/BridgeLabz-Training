
public class BankAccountSystem {
	private static String bankName = "State bank of India";
	private static int totalAcc = 0;
	private final String accountNumber;
	private String accountHolderName;
	private double balance;
	
	//constructor
	public BankAccountSystem(String accountHolderName,String accountNumber,double balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		totalAcc++;	
	}
	//Find total Number of bank account
	public static void getTotalAccount() {
		System.out.println("Total Number of accounts is:"+totalAcc);
	}
	//method to display the account details
	public void displayAccountDetails() {
		if(this instanceof BankAccountSystem) {
			System.out.println("Bank Name: "+bankName);
			System.out.println("Account Holder: "+accountHolderName);
			System.out.println("Account Number: "+accountNumber);
			System.out.println("Balance: " + balance);
		}
		else {
			System.out.println("invalid Account instance: ");
		}
	}
	// Getters and setters
	public String getAccountHolderName() {
	return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
	return balance;
	}
	//deposit method
	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
			System.out.println("Deposit $"+amount);
		}
		else {
			System.out.println("Invalid Deposit Amount");
		}
	}
	//withdraw
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdraw $:"+amount);
		}
		else {
			System.out.println("Insufficient balance or invalid amount");
		}
	}
	public static void main(String[] args) {
		BankAccountSystem acc1 = new BankAccountSystem("Shivani Sharma","Acc1234",35000.0);
		BankAccountSystem acc2 = new BankAccountSystem("kanishka","Acc5423",45000.0);
		
		//Display account
		System.out.println("Display Account 1");
		acc1.displayAccountDetails();
		System.out.println("Display Account 2");
		acc2.displayAccountDetails();
		
		//total bank account
		BankAccountSystem.getTotalAccount();
		
		//Deposit and Withdraw operation
		System.out.println("\n Performing transaction on Account 1");
		acc1.deposit(200);
		acc1.withdraw(100);
		acc1.displayAccountDetails();
		acc2.deposit(500);
		acc2.withdraw(300);
		acc2.displayAccountDetails();
	}
	
}
