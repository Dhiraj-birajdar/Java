package com.tka.leetcode;

public class SingleNumber2 {
    public static void main(String[] args) {
        System.out.println(5^1^5^2^2^5^2);
    }

//    public int singleNumber(int[] nums) {
//        int ones = 0, twos = 0;
//        for (int num : nums) {
//            ones = (ones ^ num) & ~twos;
//            twos = (twos ^ num) & ~ones;
//        }
//        return ones;
//    }

}
