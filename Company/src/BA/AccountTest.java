package BA;

public class AccountTest {

	public static void main(String[] args) {
		
		//Account account = new Account(1122, 20000);
		//account.setAnnualInterestRate(4.5);
		//account.withdraw(2500);
		//account.deposit(3000);
		
		CheckingAccount checking = new CheckingAccount(1004, 20000, -20);
		SavingsAccount saving = new SavingsAccount(1001, 20000);

		checking.setAnnualInterestRate(4.5);
		saving.setAnnualInterestRate(4.5);
	
		checking.deposit(3000);
		saving.deposit(300);
		
		saving.withdraw(250000);
		
		System.out.println(checking.toString());
		System.out.println(saving.toString());
	/*

		System.out.println("\n          Account Statement");
		System.out.println("------------------------------------------");
		System.out.println("Account ID: " + account.getId());
		System.out.println("Date created: " + account.getDateCreated());
		System.out.printf("Balance: $%.2f\n", account.getBalance());
		System.out.printf("Monthly interest: $%.2f\n", 
				account.getMonthlyInterest());
		*/
	

	}

}
