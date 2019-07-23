package triangle;

import java.util.List;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        //dp(x,y) = v(x, y) + min(dp(x-1,y), dp(x-1,y-1)) y<=n
        if(triangle.size() == 0){
            return 0;
        }
        int n = triangle.size();

        int[] dpLast = new int[n];

        dpLast[0] = triangle.get(0).get(0);
        for (int i = 1; i < triangle.size(); i++) {
            int[] dpCurrent= new int[n];
            for (int j = 0; j <= i; j++) {
                if(j==0){
                    dpCurrent[j] = dpLast[j] + triangle.get(i).get(j);
                }else if(j == i){
                    dpCurrent[j] = dpLast[j-1] + triangle.get(i).get(j);
                }else {
                    dpCurrent[j] = Math.min(dpLast[j], dpLast[j-1]) + triangle.get(i).get(j);
                }
            }
            dpLast = dpCurrent;
        }
        int result = dpLast[0];
        for (int i = 1; i < dpLast.length; i++) {
            result = Math.min(result, dpLast[i]);
        }
        return result;
    }
}
