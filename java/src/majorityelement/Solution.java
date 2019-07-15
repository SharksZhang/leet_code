package majorityelement;

class Solution {
    public int majorityElement(int[] nums) {
        return recursive(nums, 0, nums.length - 1);
    }

    public int recursive(int[] nums, int low, int high) {
        if(low ==  high){
            return nums[low];
        }

        int mid = (high - low)/ 2 + low;
        int left = recursive(nums, low, mid);
        int right = recursive(nums, mid +1, high);
        if (left == right){
            return left;
        }
        int countLeft = 0;
        int countRight = 0;
        for (int i = low; i <= high ; i++) {
            if(nums[i] == left){
                countLeft++;
            }
            if(nums[i]== right){
                countRight++;
            }
        }
        return countLeft > countRight ? left: right;
    }

}
