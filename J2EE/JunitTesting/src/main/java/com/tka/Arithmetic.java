package com.tka;


public class Arithmetic{
	
	static int sum(int a, int b) {
		return a+b;
	}
	
	static int sub(int a, int b) {
		return a-b;
	}
	
	static boolean isEven(int n) {
		return n%2==0;
	}
	
	static int[] sqrArr(int n) {		
		int[] arr = new int[5];
		for(int i = 0; i<n;i++)
			arr[i] = i*i;
		return arr;
	}
	
	
	
	public static void main(String[] args) {
		
	}
}