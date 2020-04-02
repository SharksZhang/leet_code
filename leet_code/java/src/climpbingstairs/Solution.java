package climpbingstairs;

/**
 * @author zhangyu
 */
public class Solution {
    public int climbStairs(int n) {
        int first = 1;
        int second = 1;
        for (int i = 1; i < n; i++) {
            int temp = second;
            second = first + second;
            first = temp;
        }
        return  second;
    }
}
