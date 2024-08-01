package algorithms.sort;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class QuickSort {

    public static void main(String[] args) {
        var rand = new Random();
        int[] arr = Stream.generate(() -> rand.nextInt(1, 100)).limit(10).mapToInt(i -> i).toArray();
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        sort(arr,0,arr.length-1);
    }

    private static void sort(int[] arr, int li, int hi) {

        if (li >= hi) return;
        int pivot = arr[hi];
        int lp = partition(arr, li, hi, pivot);
        sort(arr, li, lp - 1);
        sort(arr, lp + 1, hi);
    }

    private static int partition(int[] arr, int li, int hi, int pivot) {
        int lp = li, rp = hi;

        while (lp < rp) {
            for (; arr[lp] <= pivot && lp < rp; lp++) ;
            for (; arr[rp] >= pivot && lp < rp; rp--) ;
            swap(arr, lp, rp);
        }
        swap(arr, lp, hi);
        return lp;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
