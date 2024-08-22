package algorithms.sort;

import java.util.*;
import java.util.stream.Stream;

public class Quick {
     public static void main(String[] args) {
        var rand = new Random();
        int[] arr = Stream.generate(() -> rand.nextInt(1, 100)).limit(10).mapToInt(i -> i).toArray();
        qSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.gc();
        Arrays.toString(new int[]{1});
         System.out.println((int) new Quick().c);
    } 
        char c;

    private static void qSort(int[] arr, int l, int r) {
         if(l>=r) return;
//         while ()
//        for (int i = l+1; i <r ; i++) {
//
//        }
    }
}
