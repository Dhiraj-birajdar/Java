package encapsulation;

public class TestBankAccount{
	public static void main(String[] args) {
		// Creating an instance of BankAccount
		BankAccount myAccount = new BankAccount("123456789", 1000.0, "John Doe");
		
		// Accessing encapsulated data through getter methods
		System.out.println("Account Number: " + myAccount.getAccountNumber());
		System.out.println("Account Holder: " + myAccount.getAccountHolder());
		System.out.println("Balance: Rs." + myAccount.getBalance());
		
		// Performing transactions
		myAccount.deposit(500.0);
		myAccount.withdraw(200.0);
	}
	
}
