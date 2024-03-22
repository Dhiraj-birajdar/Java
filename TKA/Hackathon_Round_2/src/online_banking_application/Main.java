package online_banking_application;

public class Main {
	public static void main(String[] args) {
		// Test Online Banking Application

		// Create bank account with default credentials
		BankAccount account = new BankAccount("tka", "tka123");

		try {
			// Login with correct credentials
			account.login("tka", "tka123");
			System.out.println("Login successful.");
		} catch (InvalidCredentialsException e) {
			System.out.println("Login failed: " + e.getMessage());
		}

		try {
			// Withdraw funds
			account.withdraw(5000);
		} catch (InsufficientBalanceException e) {
			System.out.println("Withdrawal failed: " + e.getMessage());
		}

		try {
			// Withdraw more than balance
			account.withdraw(20000);
		} catch (InsufficientBalanceException e) {
			System.out.println("Withdrawal failed: " + e.getMessage());
		}
	}
}
//Problem 6: Online Banking Application:
//• Develop an online banking application in Java. Implement exception 
//handling (custom exception) to handle scenarios such as insufficient funds, 
//incorrect login credentials.
//• Operation:
//➢ Login(username, password)
//➢ withdraw
//Note: Default username= tka and password=tka123
// Default Balance = 15000
//• If the provided login credentials (username and password) do not match any 
//existing account, the system should throw a "InvalidCredentialsException".
//• If the withdrawal amount exceeds the account balance, the system should 
//throw an "InsufficientBalanceException".
//• Withdrawal transactions should only proceed if the account balance is 
//sufficient, keeping the balance unchanged if insufficient.
//• Successful withdrawals should update the account balance accordingly