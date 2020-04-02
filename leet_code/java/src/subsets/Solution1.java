package subsets;

import java.util.LinkedList;
import java.util.List;


//位运算法


class Solution1 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        for (int i = 0; i < (1<<nums.length); i++) {
            LinkedList<Integer> singleResult = new LinkedList<>();
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1<<j))!= 0){
                    singleResult.push(nums[j]);
                }
            }

            result.add(singleResult);
        }
        return result;
    }
    
}
