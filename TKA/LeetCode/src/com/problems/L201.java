package com.problems;

public class L201 {
	public static int rangeBitwiseAnd(int left, int right) {
		int n = 0;
		while (left < right) {
//        	System.out.println(right+" : "+Integer.toBinaryString(right)+"  &  "+(right -1)+" : "+Integer.toBinaryString(right-1)+"  =  "+(right&right-1)+" : "+Integer.toBinaryString(right&(right-1)));
			right = right & (right - 1);
			n++;
		}
		System.out.println("iterations 1 : " + n);
		return right;
	}

	public static int rangeBitwiseAnd2(int left, int right) {
		int c = 0;
		while (left != right) {
//			System.out.println(right+" : "+Integer.toBinaryString(right)+"  &  "+(left)+" : "+Integer.toBinaryString(left)+"  shift count = "+c);
			left = left >> 1;
			right = right >> 1;
			c++;
		}
		System.out.println("interations 2 :" + c);
		return left << c;
	}
}

/*
 * 201. Bitwise AND of Numbers Range
Solved
Medium
Topics
Companies
Given two integers left and right that represent the range [left, right], return the bitwise AND of all numbers in this range, inclusive.

 

Example 1:

Input: left = 5, right = 7
Output: 4
Example 2:

Input: left = 0, right = 0
Output: 0
Example 3:

Input: left = 1, right = 2147483647
Output: 0
 

Constraints:

0 <= left <= right <= 231 - 1
 */
