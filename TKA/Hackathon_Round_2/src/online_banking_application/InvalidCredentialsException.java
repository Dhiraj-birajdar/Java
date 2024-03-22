package online_banking_application;

//Custom exception for invalid credentials
public class InvalidCredentialsException extends Exception {
	public InvalidCredentialsException(String message) {
		super(message);
	}
}

