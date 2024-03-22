package threading;
import java.util.*;

class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		int l = s.removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4});
		System.out.println("\nlength : "+l);
	}
    public int removeDuplicates(int[] nums) {
    	int j = 1;
       for(int i = 1; i<nums.length;i++) {
    	   if(nums[i] != nums[i-1]) {
    		   nums[j] = nums[i];
    		   j++;
    	   }
       }
       return j;
    }
    
    
    public int removeDuplicates2(int[] nums) {
    	Set <Integer> s = new LinkedHashSet();
    	for(int e: nums)
    		s.add(e);
    	int i = 0;
    	for(Integer e: s)
    		nums[i++] = e;
    	 for(int e: nums) {
	        	System.out.print(e+", ");
	        }
    	return s.size();
    }
}
