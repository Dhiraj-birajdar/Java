package online_banking_application;

//Custom exception for insufficient balance
public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

