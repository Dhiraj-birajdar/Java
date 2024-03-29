package com.problems;

public class L154 {
	public static void main(String[] args) {
		int[] nums1 = {1, 3, 5};
        System.out.println("Output for nums1: " + findMin(nums1)); // Output: 1
        
        int[] nums2 = {2, 2, 2, 0, 1};
        System.out.println("Output for nums2: " + findMin(nums2)); // Output: 0
        
        int[] nums3 = {4, 5, 6, 7, 0, 1, 4};
        System.out.println("Output for nums3: " + findMin(nums3)); // Output: 0
        
        int[] nums4 = {-3, -2, -1, -1, -1, -1, -1, -5};
        System.out.println("Output for nums4: " + findMin(nums4)); // Output: -5
        
        int[] nums5 = {7};
        System.out.println("Output for nums5: " + findMin(nums5)); // Output: 7
        
        int[] nums6 = {3, 3, 3, 3, 3, 3, 3};
        System.out.println("Output for nums6: " + findMin(nums6)); // Output: 3
	}
	
	public static int findMin(int[] nums) {
	       int l = 0, r = nums.length-1;
		        while(l<r){
		            int m = l+(r-l)/2;
		            if(nums[m] < nums[r])
		                r = m-1;
		            else
		                l = m+1;
		        }
		        return nums[l]; 
	    }
}

/*
 * 154. Find Minimum in Rotated Sorted Array II
Hard
Topics
Companies
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,4,4,5,6,7] might become:

[4,5,6,7,0,1,4] if it was rotated 4 times.
[0,1,4,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums that may contain duplicates, return the minimum element of this array.

You must decrease the overall operation steps as much as possible.

 

Example 1:

Input: nums = [1,3,5]
Output: 1
Example 2:

Input: nums = [2,2,2,0,1]
Output: 0
 

Constraints:

n == nums.length
1 <= n <= 5000
-5000 <= nums[i] <= 5000
nums is sorted and rotated between 1 and n times.
 

Follow up: This problem is similar to Find Minimum in Rotated Sorted Array, but nums may contain duplicates. Would this affect the runtime complexity? How and why?
 */
