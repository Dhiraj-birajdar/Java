package online_banking_application;

//BankAccount class representing a user's bank account
public class BankAccount {
	private String username;
	private String password;
	private double balance;

	// Constructor
	public BankAccount(String username, String password) {
		this.username = username;
		this.password = password;
		this.balance = 15000; // Default balance
	}

	// Method to validate login credentials
	public void login(String username, String password) throws InvalidCredentialsException {
		if (!this.username.equals(username) || !this.password.equals(password)) {
			throw new InvalidCredentialsException("Invalid username or password.");
		}
	}

	// Method to withdraw funds
	public void withdraw(double amount) throws InsufficientBalanceException {
		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance to withdraw $" + amount);
		}
		balance -= amount;
		System.out.println("$" + amount + " withdrawn successfully. Remaining balance: $" + balance);
	}

	// Method to get balance
	public double getBalance() {
		return balance;
	}
}
