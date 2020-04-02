package longestincreasingsubsequence;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        // dp(i) = max(1 + dp(j))
        int[] dp = new int[nums.length];
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int max = 1;
            for (int j = 0; j < i; j++) {
                if(nums[j] < nums[i]){
                    max = Math.max(max, dp[j] + 1);
                }
            }
            dp[i] = max;
            result = Math.max(result, dp[i]);
        }
        return result;

    }
}
