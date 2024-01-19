package qns;

import java.util.Arrays;

public class All {
	void factorial(int n) {
		int f = 1;
		for(int i = 2; i<=n; f*=i++);
		System.out.println("Factorial of "+n+" is "+f);
	}
	
	void prime(int n) {
		boolean f = true;
		for(int i = 2; i<=(n/2); i++)
			if(n%i==0) {
				f = false;
				break;
			}
		
		if(f)
			System.out.println(n+" is prime number.");
		else
			System.out.println(n+" is not prime number.");
	}
	
	void fibonacci(int n) {
		int a = 0, b = 1, c;
		System.out.print(n+" terms of Fibonacci series are: "+a+" "+b+" ");
		for(int i = 1; i<=n-2; i++) {
			c = a+b;
			a = b;
			b = c;
			System.out.print(c+" ");
		}
			
	}
	
	void palindromeString(String s) {
		boolean f = true;
		s = s.toLowerCase();
		for(int i = 0, j = s.length()-1; i<s.length(); i++, j--) 
			if(s.charAt(i) != s.charAt(j)) {
				f = false;
				break;
			}
		
		if(f)
			System.out.println("\""+s+"\""+" is palindrome string.");
		else
			System.out.println("\""+s+"\""+" is not palindrome string.");
	}
	
	void reverseString(String s) {
		String rs = "";
		for(char c: s.toCharArray())
			rs= c+rs;
		System.out.println("String: "+"\""+s+"\""+"\nReversed String: "+"\""+rs+"\"");
	}
	
	void sumOfDigits(int n) {
		int s = 0;
		for(int i = n; i>0; i/=10)
			s+=(i%10);
		System.out.println("Sum of digits("+n+") is "+s);			
	}
	
	void armstrongNum(int n) {
		int p = String.valueOf(n).length(), s = 0;		
		for(int i = n; i>0; i/=10) {
			s+=(int)Math.pow((i%10), p);
		}
		if(s == n)
			System.out.println(n+" is Armstrong Number");
		else
			System.out.println(n+" is not Armstrong Number");
	}
	
	void duplicateEleArr() {
		
	}
	
	void countVC(String s) {
		s = s.toLowerCase();
		int vc = 0, cc = 0;
		for(char c: s.toCharArray()) {
			if(String.valueOf(c).matches("[aeiou]"))
				vc++;
			else if(String.valueOf(c).matches("[a-z]"))
				cc++;
		}
		System.out.println("String: "+s+"\nVowels count: "+vc+"\nConsonants count: "+cc);
	}
	
	void anagramsString(String s1, String s2) {
		if(s1.length() != s2.length()) {
			System.out.println(s1+" and "+s2+" are not anagrams.");
			return;
		}
		char[] c1 = s1.toLowerCase().toCharArray();
		char[] c2 = s2.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean f = true;
		for(int i = 1; i<s1.length(); i++)
			if(c1[i] != c2[i]) {
				f = false;
				break;
			}
		if(f)
			System.out.println(s1+" and "+s2+" are anagrams.");
		else
			System.out.println(s1+" and "+s2+" are not anagrams.");		
	}
}
