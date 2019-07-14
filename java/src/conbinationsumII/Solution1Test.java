package conbinationsumII;

import org.junit.jupiter.api.Test;

class Solution1Test {
    Solution1 solution = new Solution1();

    @Test
    void test_case_example1() {
        System.out.println(solution.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
    }

    @Test
    void test_case_example2() {
        System.out.println(solution.combinationSum2(new int[]{2, 5, 2, 1, 2}, 5));
    }


}