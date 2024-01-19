package flowcontrol;

public class Set3 {
	boolean isEven(int n) {
		System.out.println("Q1 WAP to accept a number and check if its even");
		return n%2==0? true: false;
	}
	
	boolean isOdd(int n) {
		System.out.println("\n\nQ2 WAP to accept a number and check if its odd");
		return n%2!=0? true: false;
	}
	
	String isEvenOdd(int n) {
		System.out.println("\n\nQ3 WAP to accept a number and find if it's even or odd");
		return n%2==0? "Even": "Odd";
	}
	
	String isNegativeZeroPositive(int n) {
		System.out.println("\n\nQ4 WAP to accept a number and find if it's Zero, Negative, Positive");
		return n==0? "Zero": n>0? "Positive": "Negative";
	}
	
	int smallestNumber(int a, int b) {
		System.out.println("\n\nQ5 WAP to accept 2 numbers and find smallest number");
		return a<b? a: b;
	}
	
	int largestNumber(int a, int b) {
		System.out.println("\n\nQ6 WAP to accept 2 numbers and find largest number");
		return a>b? a: b;
	}
	
	int evenSum(int a, int b) {
		System.out.println("\n\nQ7 WAP to accept 2 numbers and find sum of 2 even numbers");
		return a%2==0 && b%2==0? a+b: 0;
	}
	
	int oddSum(int a, int b) {
		System.out.println("\n\nQ8 WAP to accept 2 numbers and find sum of 2 odd numbers");
		return a%2!=0 && b%2!=0? a+b: 0;
	}
	
	int sum(int a, int b) {
		System.out.println("\n\nQ9 WAP to accept 2 numbers and find sum of 2 even or odd numbers");
		return a+b;
	}
		
	String weekday(int d) {
		System.out.println("\n\nQ10 WAP to accept a day of week(int) and display the weekday");
		switch(d) {
		case 1: return "Monday";
		case 2: return "Tuesday";
		case 3: return "Wednesday";
		case 4: return "Thursday";
		case 5: return "Friday";
		case 6: return "Saturday";
		case 7: return "Sunday";
		default: return "Enter valid day";
		}		
	}
	
	
}
