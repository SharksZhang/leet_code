package besttimetobuyandsellstockII;

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyIn = -1;
        for (int i = 0; i < prices.length - 1; i++) {
            if (buyIn < 0 && prices[i] < prices[i + 1]) {
                buyIn = prices[i];
            }
            else if(buyIn >= 0 && prices[i]>= prices[i +1]){
                profit += (prices[i] - buyIn);
                buyIn = -1;
            }
        }
        if (buyIn >= 0) {
            profit += prices[prices.length -1] - buyIn;
        }
        return profit;

    }
}
