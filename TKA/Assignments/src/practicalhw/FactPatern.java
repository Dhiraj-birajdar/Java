package practicalhw;

public class FactPatern {

	long factorial(int n) {
		long f =1;
		for(int i = 1; i<=n;f*=i, i++);
		return f;
	}
	
	void printPatern() {
		
		for(int i = 2; i<=8; i+=2) {
			for(int j = i; j<=i+6 ; j+=2)
				System.out.printf("%-3d  ",j);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		FactPatern a = new FactPatern();
		
		System.out.println("Factorial of 1 to 20: ");
		for(int i =1; i<=20; i++)
			System.out.println(i+"! = "+a.factorial(i));
		
		System.out.println("\nPatern print : ");
		a.printPatern();
	}

}
