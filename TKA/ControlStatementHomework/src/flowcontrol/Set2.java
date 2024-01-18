package flowcontrol;

public class Set2 {
	
	void Q1() {
		System.out.println("\n\nQ1 Generate the series 2's table.");
		for (int i = 2; i <= 20; i+=2) {
			System.out.print(i+", ");
		}
	}

	void Q2() {
		System.out.println("\n\nQ2 Generate the series 9's table");
		for (int i = 9; i <= 90; i+=9) {
			System.out.print(i+", ");
		}
	}

	void Q3() {
		System.out.println("\n\nQ3 Generate the series 1, -2, 3, -4....-10");
		for (int i = 1; i <= 10; i++)
			if(i%2==0)
				System.out.print(0-i+", ");
			else
				System.out.print(i+", ");
	}

	void Q4() {
		System.out.println("\n\nQ4 Generate the series 5's table");
		for (int i = 5; i <= 50; i += 5)
			System.out.print(i+", ");
	}

	void Q5() {
		System.out.println("\n\nQ5 Generate the series 1, 10, 100, 1000");		
		for (int i = 1; i <= 1000; i *= 10)
			System.out.print(i+", ");
	}

//	 incomplete
	void Q6() {
		System.out.println("\n\nQ6 Generate the series 1,3,6,10,15,21,28,36,45");
		int s = 0;
		for(int i = 1; i<10; i++)
			System.out.print((s+=i)+", ");
	}

	void Q7() {
		System.out.println("\n\nQ7 Generate the series 8's table");
		for (int i = 8; i <= 80; i+=8)
			System.out.print(i+", ");
	}

	void Q8() {
		System.out.println("\n\nQ8 Generate the series 0,1,1,2,3,5,8,13,21");
		int f1=0, f2=1, f3;
		System.out.print("0, 1, ");
		for (int i = 1; i <= 8; i++) {
			f3 = f1+f2;
			f1 = f2;
			f2 = f3;
			System.out.print(f3+", ");
		}
	}

	void Q9() {
		System.out.println("\n\nQ9 Generate the series squares of 1 to 10");
		for(int i = 1; i<=10; i++)
			System.out.print(i*i+", ");
	}

	void Q10() {
		System.out.println("\n\nQ10 Generate the series 3's table");
		for (int i = 3; i <= 30; i+=3)
				System.out.print(i+", ");
	}

	void Q11() {
		System.out.println("\n\nQ11 Generate the series 7's table");
		for (int i = 7; i <= 70; i+=7)
				System.out.print(i+", ");
	}

	void Q12() {
		System.out.println("\n\nQ12 Generate the series 4's table");
		for (int i = 4; i <= 40; i+=4)
				System.out.print(i+", ");
	}

	void Q13() {
		System.out.println("\n\nQ13 Generate the series 10's table");
		for (int i = 10; i <= 100; i+=10)
				System.out.print(i+", ");
	}

	void Q14() {
		System.out.println("\n\nQ14 Generate the series 1 2 3 4 5 4 3 2 1");
		String s = "5";
		for(int i = 4; i >= 1; i--)
			s = (i+" "+s+" "+i);
		System.out.print(s);
	}

	void Q15() {
		System.out.println("\n\nQ15 Generate the series 6's table");
		for (int i = 6; i <= 60; i+=6)
				System.out.print(i+", ");
	}
}
