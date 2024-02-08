package abstractionbyinterface;

//Define the RBI (Reserve Bank of India) interface
interface RBI {
	void openAccount();

	void closeAccount();

	void deposit(double amount);

	void withdraw(double amount);
}

//Implement the RBI interface in the SBI (State Bank of India) class
class SBI implements RBI {
	private String branch;

	public SBI(String branch) {
		this.branch = branch;
	}

	@Override
	public void openAccount() {
		System.out.println("Account opened at SBI branch: " + branch);
	}

	@Override
	public void closeAccount() {
		System.out.println("Account closed at SBI branch: " + branch);
	}

	@Override
	public void deposit(double amount) {
		System.out.println("Depositing " + amount + " INR at SBI branch: " + branch);
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("Withdrawing " + amount + " INR from SBI branch: " + branch);
	}
}

//Example usage
public class Banking {
	public static void main(String[] args) {
		RBI sbiAccount = new SBI("Pune");

		// Interacting with the SBI account through the RBI interface
		sbiAccount.openAccount();
		sbiAccount.deposit(5000);
		sbiAccount.withdraw(2000);
		sbiAccount.closeAccount();
	}
}
