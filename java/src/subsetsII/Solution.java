package subsetsII;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        HashSet<List<Integer>> result = new HashSet<>();
        LinkedList<Integer> singleResult = new LinkedList<>();
        result.add(singleResult);
        Arrays.sort(nums);
        subsetsWithDupRecursive(result, singleResult, nums, 0);
        return  new LinkedList<>(result);
    }

    public void subsetsWithDupRecursive(HashSet<List<Integer>> result, LinkedList<Integer> singleResult, int[] nums, int i) {
        if(i >= nums.length){
            return;
        }
        singleResult.push(nums[i]);
        result.add(new LinkedList<>(singleResult));
        subsetsWithDupRecursive(result, singleResult, nums, i+1);

        singleResult.pop();
        subsetsWithDupRecursive(result, singleResult, nums, i+1);
    }
}