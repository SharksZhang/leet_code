package subsetsII;

import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {
    Solution solution = new Solution();
    @Test
    void printResult() {
        for (List<Integer> subset : solution.subsetsWithDup(new int[]{1, 2, 2})) {
            System.out.println(subset);
        }
    }

}