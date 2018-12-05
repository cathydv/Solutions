package BA;
import java.util.Date;

public class Account {

	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;
	
	public Account() {
		id=0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
		
	}
	
	public Account(int id, double balance) {
		this.id=id;
		this.balance=balance;
		dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

	public String getDateCreated() {
		return dateCreated.toString();
	}


	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate()/100);
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public String toString() {
		return "\nAccount ID: " + id + "\nDate created: " + getDateCreated()
			+ "\nBalance: $" + String.format("%.2f", balance) + 
			"\nMonthly interest: $" + String.format("%.2f", getMonthlyInterest());
	}
}

