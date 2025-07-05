package com.tka.recursion;

public class DecimalToBinary {

    public static void main(String[] args) {
        System.out.println(toBinary(8));
    }

    public static String toBinary(int n) {
        return n == 0 ? "" : toBinary(n / 2) + (n % 2);

//        if(n<=1)
//            return 1+"";
//        return toBinary(n/2)+(n%2);
    }
}
