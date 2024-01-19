package flowcontrol;
import java.util.Scanner;
public class TestSet3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("Enter 2 numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		Set3 s3 = new Set3();
		
		System.out.println(a+": "+s3.isEven(a));
		System.out.println(a+": "+s3.isOdd(a));
		System.out.println(a+": "+s3.isEvenOdd(a));
		System.out.println(a+": "+s3.isNegativeZeroPositive(a));
		System.out.println(a+", "+b+": "+s3.smallestNumber(a, b));
		System.out.println(a+", "+b+": "+s3.largestNumber(a, b));
		System.out.println(a+", "+b+": "+s3.evenSum(a, b));
		System.out.println(a+", "+b+": "+s3.oddSum(a, b));
		System.out.println(a+", "+b+": "+s3.sum(a, b));
		System.out.println(a+": "+s3.weekday(a));
	}

}
