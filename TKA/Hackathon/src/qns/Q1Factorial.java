package qns;

public class Q1Factorial {
	static int factorial(int n) {
		int f = 1;
		for(int i = 2; i<=n; f*=i++);
		return f;
	}
	
	public static void main(String[] args) {
		System.out.println(Q1Factorial.factorial(3));
	}
}
