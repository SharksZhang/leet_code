package maximunsubarray;

class Solution {
    public int maxSubArray(int[] nums) {
        // DP(i) = max(Dp(i-1), num[i])
        int result = nums[0];
        int subSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            subSum = Math.max(subSum + nums[i], nums[i]);
            result = Math.max(result, subSum);
        }
        return  result;
    }
}
