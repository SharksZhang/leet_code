package conbinationsumII;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> subSets = new LinkedList<>();
        Arrays.sort(candidates);
        int border = 0;
        while (border <candidates.length && candidates[border] <= target){
            border++;
        }

        for (int i = 0; i < 1 << border; i++) {
            LinkedList<Integer> tempList = new LinkedList<>();
            for (int j = 0; j < border; j++) {
                if((i & (1 << j)) != 0){
                    tempList.push(candidates[j]);
                }
            }
            subSets.add(new LinkedList<Integer>(tempList));
        }

        HashSet<List<Integer>> resultSet = new HashSet<>();
        for (List<Integer> subSet : subSets) {
            int sum =0;
            for (Integer integer : subSet) {
                sum += integer;
            }
            if(sum == target){
                resultSet.add(subSet);
            }
        }

        return  new LinkedList<>(resultSet);
    }
}
