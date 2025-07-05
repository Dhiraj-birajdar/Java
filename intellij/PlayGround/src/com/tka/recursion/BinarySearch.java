package com.tka.recursion;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(binarySearch(arr,1));
        int[] ints = Arrays.copyOfRange(arr, 0, 3);
        System.out.println(Arrays.toString(ints));
    }

    private static int binarySearch(int[] arr, int target){
        return binarySearch(arr,target,0,arr.length-1);
    }
    private static int binarySearch(int[] arr,int target, int l, int r){
        if(l>r) return -1;

        int mid = l+ (r-l)/2;

        if(arr[mid]==target)
            return mid;
        else if (arr[mid]<target)
            return binarySearch(arr,target,mid+1,r);
        else
            return binarySearch(arr,target,l,mid-1);
    }
}
