package problems.prefixsum;

import java.util.Arrays;

public class PivotIndex {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{-1,-1,1,1,0,0}));
    }

    static public int pivotIndex(int[] nums) {
        int pivot = -1;
        if (nums.length == 1)
            return 0;
        int[] up = new int[nums.length], down = new int[nums.length];
        up[0] = nums[0];
        down[nums.length - 1] = nums[nums.length - 1];
        for (int i = 1, j = nums.length - 2; i < nums.length; i++, j--) {
            up[i] = nums[i] + up[i - 1];
            down[j] = nums[j] + down[j + 1];
        }
        System.out.println(Arrays.toString(up));
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(down));

        if (down[1] == 0) return 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (up[i - 1] == down[i + 1]) {
                pivot = i;
                break;
            }
        }
        System.out.println(pivot);
        if(pivot == -1 && up[up.length - 2] == 0 ) return up.length-1;
        return pivot;
    }
}
// 1,3,6
// 6,5,3
