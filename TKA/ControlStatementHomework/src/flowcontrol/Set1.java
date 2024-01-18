package flowcontrol;

public class Set1 {

	void Q1() {
		System.out.println("\n\nQ1 WAP to print 1 to 25.");
		for (int i = 1; i <= 25; i++) {
			System.out.print(i+", ");
		}
	}

	void Q2() {
		System.out.println("\n\nQ2 WAP to print 25 to 1.");
		for (int i = 25; i >= 1; i--) {
			System.out.print(i+", ");
		}
	}

	void Q3() {
		System.out.println("\n\nQ3 WAP 1 to 100 odd numbers.");
		for (int i = 1; i <= 100; i += 2)
			System.out.print(i+", ");
	}

	void Q4() {
		System.out.println("\n\nQ4 WAP 1 to 100 ever numbers.");
		for (int i = 2; i <= 100; i += 2)
			System.out.print(i+", ");
	}

	void Q5() {
		System.out.println("\n\nQ5 WAP to print sum of 1 to 50 odd numbers.");
		int s = 0;
		for (int i = 1; i <= 50; i += 2)
			s += i;
		System.out.print("Sum of 1 to 50 odd numbers: " + s);
	}

	void Q6() {
		System.out.println("\n\nQ6 WAP to print sum of 1 to 50 even numbers.");
		int s = 0;
		for (int i = 2; i <= 50; i += 2)
			s += i;
		System.out.print("Sum of 1 to 50 even numbers: " + s);
	}

	void Q7() {
		System.out.println("\n\nQ7 WAP to print -45 to 45.");
		for (byte b = -45; b <= 45; b++)
			System.out.print(b+", ");
	}

	void Q8() {
		System.out.println("\n\nQ8 WAP to print 50 to  100");
		for (int i = 50; i <= 100; i++)
			System.out.print(i+", ");
	}

	void Q9() {
		System.out.println("\n\nQ9 WAP to print sum of odd and even numbers.");
		int so = 0, se = 0;
		for (int i = 1; i <= 100; i++)
			if (i % 2 == 0)
				se += i;
			else
				so += i;
		System.out.println("Sum of 1 to 100 odd numbers: " + so);
		System.out.print("Sum of 1 to 100 even numbers: " + se);
	}

	void Q10() {
		System.out.println("\n\nQ10 WAP to print even and odd number.");
		for (int i = 1; i <= 10; i++)
			if (i % 2 == 0)
				System.out.println("Even: " + i);
			else
				System.out.println("Odd: " + i);
	}

	void Q11() {
		System.out.println("\n\nQ11 WAP to print 1 to  100.");
		for (int i = 1; i <= 100; i++)
			System.out.print(i+", ");
	}

	void Q12() {
		System.out.println("\n\nQ12 WAP to print  100 to 1.");
		for (int i = 100; i >= 1; i--)
			System.out.print(i+", ");
	}

	void Q13() {
		System.out.println("\n\nQ13 WAP to print 30 to 50.");
		for (int i = 30; i <= 50; i++)
			System.out.print(i+", ");
	}

	void Q14() {
		System.out.println("\n\nQ14 WAP to print count of even numbers from 1 to 25.");
		int c = 0;
		for (int i = 1; i <= 25; i++)
			if (i % 2 == 0)
				c++;
		System.out.print("Count of even numbers from 1 to 25: " + c);
	}

	void Q15() {
		System.out.println("\n\nQ15 WAP to print count of odd numbers from 1 to 25.");
		int c = 0;
		for (int i = 1; i <= 25; i++)
			if (i % 2 != 0)
				c++;
		System.out.print("Count of odd numbers from 1 to 25: " + c);
	}
}
