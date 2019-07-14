package conbinationsumII;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

class Solution1 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        HashSet<LinkedList<Integer>> subSets = new HashSet<>();
        int sum =0;
        generateSubset(candidates,0, subSets, new LinkedList<>(), sum, target );


        return  new LinkedList<>(subSets);
    }

    public static void generateSubset(int[] candidates, int i, HashSet<LinkedList<Integer>> resultSet,
                                 LinkedList<Integer> tmpSet, int sum, int target) {
        if (i >= candidates.length) {
            return;
        }
        sum += candidates[i];
        if (sum > target){
            return;
        }
        if(sum <=  target){
            tmpSet.push(candidates[i]);
            if(sum == target){
                resultSet.add(new LinkedList<>(tmpSet));
            }
            generateSubset(candidates, i+1, resultSet, tmpSet, sum, target);
            tmpSet.pop();
            sum -= candidates[i];
        }
        generateSubset(candidates, i+1, resultSet, tmpSet, sum, target);
    }
}
