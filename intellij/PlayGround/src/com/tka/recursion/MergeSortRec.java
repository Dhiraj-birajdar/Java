package com.tka.recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortRec {
    public static void main(String[] args) {
        int[] arr = {1,3,5,9,10,15,2,4,7,9};
        merge(arr,0,5,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void merge(int[] arr,int l, int m, int r){
        int[] ans = arr;
        arr = Arrays.copyOf(ans,ans.length);
        int s = m+1,i=0;
        while(l<=m && s<=r){
            if(arr[l] < arr[s]){
                ans[i++] = arr[l++];
            } else {
                ans[i++] = arr[s++];
            }
        }
        s = l>m?s:l;
        while (i<ans.length){
            ans[i++] = arr[s++];
        }
    }
}
