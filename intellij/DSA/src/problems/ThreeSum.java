package problems;

import java.lang.reflect.Array;
import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(twoSum(new int[]{1,2,3,4,5,6,7,8,9},5,0)));
        var list = threeSum(new int[]{0,0,0,0});
        list.forEach(System.out::println);
    }

    static public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0;i< nums.length;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int l = i+1, r = nums.length-1;
            while (l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum > 0)
                    r--;
                else if (sum < 0)
                    l++;
                else{
                    list.add(List.of(nums[i],nums[l],nums[r]));
                    l++;
                    while (nums[l]==nums[l-1] && l<r) l++;
                }
            }
        }
        return list;
    }

    static public int[] twoSum(int[] arr, int target){
        Arrays.sort(arr);
        for(int l=0, r=arr.length-1;l<r;){
            if(arr[l]+arr[r]==target)
                return new int[]{l,r};
            else if(arr[l]+arr[r]>target)
                r--;
            else
                l++;
        }
        return new int[1];
    }
}
