package majorityelement;

class Solution1 {
    public int majorityElement(int[] nums) {
        int count = 0;
        int result = -1;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0 ){
                result = nums[i];
                count++;
            }else if(nums[i] == result){
                count++;
            }else {
                count --;
            }
        }
        return result ;
    }


}
