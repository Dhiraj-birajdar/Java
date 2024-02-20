package exceptions;

//Custom checked exception for underage voters
class UnderageException extends Exception {
	public UnderageException(String message) {
		super(message);
	}
}

//Class representing a voter
class Voter {
	private int age;

	public Voter(int age) {
		this.age = age;
	}

// Method to check eligibility and vote
	public void vote() throws UnderageException {
		if (age < 18) {
			throw new UnderageException("Voter is underage and cannot vote.");
		} else {
			System.out.println("Voter has cast the vote.");
		}
	}
}

//Main program
public class Checked {
	public static void main(String[] args) {
		// Creating a voter with age 16
		Voter underageVoter = new Voter(16);

		try {
			// Attempting to vote with an underage voter
			underageVoter.vote();
		} catch (UnderageException e) {
			System.out.println("Caught UnderageException: " + e.getMessage());
		}finally {
			System.out.println("Next voter...");
		}

		// Creating a voter with age 20
		Voter eligibleVoter = new Voter(20);

		try {
			// Attempting to vote with an eligible voter
			eligibleVoter.vote();
		} catch (UnderageException e) {
			// This block will not be executed for eligible voters
			System.out.println("Caught UnderageException: " + e.getMessage());
		}finally {
			System.out.println("Next voter...");
		}
	}
}
