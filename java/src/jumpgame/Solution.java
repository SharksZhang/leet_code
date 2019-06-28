package jumpgame;

class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length < 1) {
            return false;
        }
        int target = nums.length -1;
        for (int i = nums.length -2 ; i > -1; i--) {
            if (target- i <= nums[i]){
                target = i;
            }
        }
        if(target == 0){
            return true;
        }
        return false;

    }
}
