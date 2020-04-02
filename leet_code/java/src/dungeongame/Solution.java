package dungeongame;

public class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        //dp(x,y) = max(dp(x+1, y), dp(x, y+1))> 0? d(x,y) : max(dp(x+1, y), dp(x, y+1)) + d(x,y)
        if(dungeon.length == 0){
            return 0;
        }
        int row = dungeon.length;
        if(dungeon[0].length == 0){
            return  0;
        }
        int col = dungeon[0].length;
        int[][] dp = new int[row][col];

        dp[row - 1][col - 1] = dungeon[row - 1][col - 1];

        for (int i = col -2 ; i >= 0 ; i--) {
            int temp = dp[row-1][i +1] > 0 ? 0 : dp[row-1][i +1];
            dp[row-1][i] = temp + dungeon[row-1][i];
        }

        for (int i = row -2 ; i >= 0 ; i--) {
            int temp = dp[i+1][col -1] >0 ? 0 : dp[i+1][col -1] ;
            dp[i][col-1] = temp  + dungeon[i][col - 1];
        }


        for (int i = row -2 ; i >= 0; i--) {
            for (int j = col -2 ; j >= 0; j--) {
                int temp = Math.max(dp[i+1][j], dp[i][j+1])>0 ? 0:Math.max(dp[i+1][j], dp[i][j+1]);
                dp[i][j] = dungeon[i][j] + temp;
            }
        }

        return dp[0][0] >= 0 ? 1 : Math.abs(dp[0][0]) + 1;
    }
}
