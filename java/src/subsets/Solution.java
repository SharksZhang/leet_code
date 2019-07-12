package subsets;

import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        LinkedList<Integer> singleResult = new LinkedList<>();
        addRecursive(result, singleResult, nums, 0);
        result.add(new LinkedList<>());
        return result;
    }
    
    public void addRecursive(List<List<Integer>> result, LinkedList<Integer> singleResult, int[] nums, int i){
        if (i >= nums.length) {
            return;
        }

        singleResult.push(nums[i]);
        result.add(new LinkedList<>(singleResult));
        addRecursive(result, singleResult, nums, i+1);

        singleResult.pop();
//        temp = new LinkedList<>(singleResult);
//        result.add(temp);
        addRecursive(result, singleResult, nums, i+1);
    }
}
