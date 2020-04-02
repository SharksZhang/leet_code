package GenerateParentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void example() {
        System.out.println(solution.generateParenthesis(3));
    }
}