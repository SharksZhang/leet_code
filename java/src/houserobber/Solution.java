package houserobber;

public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }
        if (nums.length == 2){
            return nums[0]>nums[1]?nums[0] : nums[1];
        }
        int first = nums[0];
        int second = nums[0]>nums[1]?nums[0] : nums[1];
        for (int i = 2; i < nums.length; i++) {
            int temp = second;
            second = Math.max(nums[i] + first, second);
            first = temp;
        }
        return second;
    }
}
