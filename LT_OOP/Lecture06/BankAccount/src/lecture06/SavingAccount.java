package lecture06;

public class SavingAccount extends BankAccount {


	private double annualInterestRate;
	
	public SavingAccount(String ownerName, String accountNumber, double initialBalance, double annualInterestRate) {
		super(ownerName, accountNumber, initialBalance);
		this.annualInterestRate = annualInterestRate;
	}

	
	public double calculateMonthlyInterest() {
		return balance * (annualInterestRate / 12);
	}
	
	//override
	public void withdraw(double amount) {
		System.out.println("Withdrawals are not allowed from a saving account.");
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
		else {
			System.out.println("Deposit amount must be positive.");
		}
	}
	
}
