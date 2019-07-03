package gasstation;

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum= 0;
        int maxSumIndex = -1;
        int tmpSum = 0;
        for (int i = gas.length -1 ; i > -1; i--) {
            sum += (gas[i] - cost[i]);
            if (sum >= tmpSum){
                maxSumIndex = i;
                tmpSum = sum;
            }
        }
        return sum >= 0 ? maxSumIndex : -1;
    }
}
