package lecture06;

public class BankAccount {
	protected String ownerName;
	protected String accountNumber;
	protected double balance;
	private static final double MIN_BALANCE = 50000;
	private static final double WITHDRAW_FEE= 5000;
	
	public BankAccount(String ownerName, String accountNumber, double initialBalance) {
		this.ownerName = ownerName;
		this.accountNumber = accountNumber;
		this.balance = initialBalance >= MIN_BALANCE ? initialBalance : MIN_BALANCE;
	}
	
	public void deposit(double amount) {
		if (amount > 0){
			balance += amount;
		}
		else {
			System.out.println("Deposit amount must be positive.");
		}
	}
	
	public void withdraw(double amount) {
		if (amount >0 && (balance - amount - WITHDRAW_FEE >= MIN_BALANCE)) {
			balance -= amount;
		}
		else {
			System.out.println("Insufficient balance or invalid withdraw amount.");
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getOwner() {
		return ownerName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
}

