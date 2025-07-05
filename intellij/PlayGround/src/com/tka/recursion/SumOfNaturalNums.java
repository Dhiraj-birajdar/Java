package com.tka.recursion;

public class SumOfNaturalNums {
    public static void main(String[] args) {
        System.out.println(nSum(10));
    }

    private static int nSum(int i) {
        if(i<=1) return i;
        return i+nSum(i-1);
    }
}
