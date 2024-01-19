package flowcontrol;

import java.util.Scanner;
public class ArithmeticMenu {
	static void add(int a, int b) {
		System.out.println(a+" + "+b+" = "+(a+b));
	}
	
	static void sub(int a, int b) {
		System.out.println(a+" - "+b+" = "+(a-b));
	}
	
	static void mul(int a, int b) {
		System.out.println(a+" * "+b+" = "+(a*b));
	}
	
	static void div(int a, int b) {
		System.out.println(a+" / "+b+" = "+(a/b));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch, a, b;
		System.out.print("Enter 2 numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		while(true){
			System.out.print("1: Addition\n2: Subtraction\n3: Multiplication\n4: Division\n5: Exit\n\nEnter choice: ");
			ch = sc.nextInt();
			if(ch == 1)
				ArithmeticMenu.add(a, b);
			else if(ch == 2)
				ArithmeticMenu.sub(a, b);
			else if(ch == 3)
				ArithmeticMenu.mul(a, b);
			else if(ch == 4)
				ArithmeticMenu.div(a, b);
			else if(ch == 5)
				break;
			else
				System.out.println("Enter valid choice.");			
		}
		sc.close();
		System.out.println("End of program.");		

	}

}
