package assigncookies;

import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        for (int i : g) {
            System.out.println(i);
        }
        for (int i : s) {
            System.out.println(i);
        }
        int i =0, j =0;
        while ( i <g.length && j<s.length ) {
            if(g[i] <= s[j]){
                i ++;
                j ++;
            }else {
                j ++;
            }
        }
        return i;
    }
}
