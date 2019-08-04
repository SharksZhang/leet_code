package searchrange;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = bSearchLow(nums, target);
        result[1] = bSearchHigh(nums, target);
        return result;
    }

    public int bSearchLow(int[] nums, int target){
        int low = 0;
        int high =nums.length-1;
        while(low <= high){
            int mid  =(low + high)/2;
            if(nums[mid] == target){
                if(mid ==0 || nums[mid -1] < target ){
                    return mid;
                }
                high = mid -1;
            }else if(target>nums[mid]){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return -1;
    }

    public int bSearchHigh(int[] nums, int target){
        int low = 0;
        int high =nums.length -1 ;
        while(low <= high){
            int mid  =(low + high)/2;
            if(nums[mid] == target){
                if(mid ==nums.length -1 || nums[mid +1] > target ){
                    return mid;
                }
                low = mid +1;
            }else if(target>nums[mid]){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return -1;
    }
}