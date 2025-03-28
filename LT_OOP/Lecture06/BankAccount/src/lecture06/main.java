package lecture06;

public class main {

	public static void main(String[] args) {
		//create a normal bank account
		BankAccount normalAccount = new BankAccount("Duc Anh","109876526233",100000);
		System.out.println("- Account of "+normalAccount.getOwner()+" has the init balance of "+normalAccount.getBalance());
		
		//test deposit
		normalAccount.deposit(10000);
		System.out.println("- Balance after deposit 10000 : "+normalAccount.getBalance());
		
		//test withdraw within limit
		normalAccount.withdraw(10000);
		System.out.println("- Balance after withdraw 10000 : "+normalAccount.getBalance());
		
		//test withdraw that exceeds balance limit
		System.out.println("- Attempt to withdraw 100000 ");
		normalAccount.withdraw(1000000);
		System.out.println("Balance after attempting to withdraw 100000 : "+normalAccount.getBalance());
		
		//create a saving account
		SavingAccount savingAccount = new SavingAccount("Duc Anh","123456789",150000 , 0.05); //5% annual interest rate
		System.out.println("- Initial Balance ( saving account ) of "+savingAccount.getOwner()+ " is "+savingAccount.getBalance());
		
		//test deposit on Saving account
		savingAccount.deposit(2500000);
		System.out.println("- balance after deposit 2500000 ( saving account ) : "+savingAccount.getBalance());
		
		//test calculate monthly interest 
		double monthlyInterest = savingAccount.calculateMonthlyInterest();
		System.out.println("- Monthly interest ( saving account ) : "+monthlyInterest);
		
		//test withdrawals on saving account
		System.out.println("- Attempt to withdraw 10000 from saving account ");
		savingAccount.withdraw(10000);
		System.out.println("Balance after failed withdrawal attempt (saving account ) : "+savingAccount.getBalance());
		
		
	}

}
