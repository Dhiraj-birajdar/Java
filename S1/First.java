//import java.lang.*;
import java.util.Scanner;

public class First{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String name;
		System.out.println("enter name : ");
		name = s.nextLine();
		System.out.println(name);

		System.out.println("enter 2 no : ");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(a+b);
		s.close();

	}
}