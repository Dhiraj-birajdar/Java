package exceptions;

//Custom unchecked exception for invalid input
class InvalidInputException extends RuntimeException {
	public InvalidInputException(String message) {
		super(message);
	}
}

//Simple calculator class
class Calculator {
	// Method to perform division
	public static double divide(int numerator, int denominator) {
		if (denominator == 0) {
			throw new InvalidInputException("Cannot divide by zero.");
		}
		return (double) numerator / denominator;
	}
}

//Main program
public class UnChecked {
	public static void main(String[] args) {
		int numerator = 10;
		int denominator = 0;

		try {
			// Attempting to perform division with an invalid denominator
			double result = Calculator.divide(numerator, denominator);
			System.out.println("Result: " + result);
		} catch (InvalidInputException e) {
			System.out.println("Caught InvalidInputException: " + e.getMessage());
		}
		denominator = 5;
		try {
			// Attempting to perform division with an invalid denominator
			double result = Calculator.divide(numerator, denominator);
			System.out.println("Result: " + result);
		} catch (InvalidInputException e) {
			System.out.println("Caught InvalidInputException: " + e.getMessage());
		}
	}
}
