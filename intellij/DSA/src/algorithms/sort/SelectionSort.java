package algorithms.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Stream;

public class SelectionSort {
    public static void main(String[] args) {
         Random random = new Random();
        int[] arr = Stream.generate(() -> random.nextInt(100)).limit(10).mapToInt(i-> i).toArray();
        sort(arr);
//        Collections.synchronizedList(new ArrayList<>()); // todo use wrapper for vector like thread safe behaviour
    }
    static public void sort(int[] arr){
        System.err.println("Selection Sort =>");
        System.out.println("Before sorting: "+Arrays.toString(arr));

        int minIndex, temp;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length-1; i++) {
            minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("After sorting: "+Arrays.toString(arr));
        System.out.println("Time taken : "+(endTime-startTime)+"ms");
    }
}
