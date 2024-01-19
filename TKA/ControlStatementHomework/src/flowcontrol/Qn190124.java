package flowcontrol;

public class Qn190124 {

	static void _192to132() {
		System.out.print("Range 192 to 132: ");
		for(int i = 192; i>=132; i--)
			System.out.print(i+", ");
	}
	
	static void add10() {
		int s = 0;
		for(int i = 1; i<=10; s+=i++);
		System.out.println("\nAddition of first 10 no: "+s);
	}
	
	static void fact5() {
		int f = 1;
		for(int i = 1; i<=5; f*=i++);
		System.out.println("Factorial of 5: "+f);
	}
	
	public static void main(String[] args) {
		
		Qn190124._192to132();
		Qn190124.add10();
		Qn190124.fact5();
	}

}
