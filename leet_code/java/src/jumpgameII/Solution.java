package jumpgameII;

//class Solution {
//    public int jump(int[] nums) {
//        int count = 0;
//        int target = nums.length -1;
//        while (target > 0) {
//            for (int i = 0; i < target ; i++) {
//                if(target - i <= nums[i]){
//                    target = i;
//                    count ++;
//                    break;
//                }
//            }
//        }
//        return count;
//    }
//}

class Solution {
    public int jump(int[] nums) {
        int curLocation = 0;
        int far =0;
        int jumps = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i > curLocation){
                curLocation = far;
                jumps ++;
            }
            far = Math.max(far, nums[i] + i);

        }
        return jumps;
    }
}