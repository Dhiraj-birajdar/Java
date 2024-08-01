package algorithms.search;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class BinarySearch {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[]{1,2,3,4,5,6};
        System.out.println(search(nums,0));

//        List<Integer> li = new CopyOnWriteArrayList<>();
//        li.add(1);
//        li.add(2);
//        for(int i: li){
//            System.out.println(i);
//            li.add(i+5);
//        }
//        System.out.println(li);
    }

    public static int search(int[] arr, int v){
        int l=0, r=arr.length-1,mid;
        while (l<=r){
            mid = l+(r-l)/2;
            if(arr[mid] == v){
                return mid;
            }else if(v > arr[mid]){
                l = mid+1;
            }else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
