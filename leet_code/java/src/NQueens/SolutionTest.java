package NQueens;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void exapmle() {
        System.out.println(solution.solveNQueens(4));
    }
}