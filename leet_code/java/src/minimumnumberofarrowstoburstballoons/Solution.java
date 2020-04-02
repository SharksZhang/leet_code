package minimumnumberofarrowstoburstballoons;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length ==0){
            return 0;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]- o2[0];
            }
        });
        int curMax = points[0][1];
        int result = 1;
        for (int[] point : points) {
            if(point[0]> curMax){
                result ++;
                curMax = point[1];
            }else if (curMax > point[1]){
                curMax = point[1];
            }
        }
        return result;
    }
}