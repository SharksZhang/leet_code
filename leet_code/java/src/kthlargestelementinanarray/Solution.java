package kthlargestelementinanarray;


class Solution {
    public int findKthLargest(int[] nums, int k) {
        return nums[search(nums, 0, nums.length - 1, k)];
    }

    public int search(int[] nums, int low, int high, int k) {
        int pivot = partition(nums, low, high);
        if (pivot == k -1 ){
            return pivot;
        }
        if(pivot > k-1 ){
            pivot = search(nums, low, pivot, k);
        }else {
            pivot = search(nums, pivot +1, high, k);
        }
        return pivot;

    }

    public int partition(int[] nums, int low , int high){
        int pivot = nums[low];
        while (low < high){
            while (high > low && nums[high] <= pivot){
                high --;
            }
            swap(nums, low, high);
            while (high > low && nums[low] >= pivot){
                low ++;
            }
            swap(nums, low, high);
        }
        return low;
    }

    private void swap(int[] nums, int low, int high) {
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }

}