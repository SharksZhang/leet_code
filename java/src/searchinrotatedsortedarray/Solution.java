package searchinrotatedsortedarray;

class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        int peak = findPeak(nums);

        return target >= nums[0] ? bSearch(nums, 0, peak, target) : bSearch(nums, peak + 1, nums.length - 1, target);


    }

    public int bSearch(int[] nums, int low, int high, int target) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public int findPeak(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if ((mid == 0 && nums[mid] > nums[mid + 1])) {
                return mid;
            } else if (mid != 0 && nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid] >= nums[low]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}

