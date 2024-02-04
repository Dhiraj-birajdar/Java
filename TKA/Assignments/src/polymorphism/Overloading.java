package polymorphism;

class Calculator {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to concatenate two strings
    public String add(String str1, String str2) {
        return str1 + str2;
    }

}


public class Overloading {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		System.out.println("Sum of two integers: " + calculator.add(5, 7));
		System.out.println("Sum of three integers: " + calculator.add(3, 8, 2));
		System.out.println("Concatenation of two strings: " + calculator.add("Hello, ", "World!"));
	}

}
