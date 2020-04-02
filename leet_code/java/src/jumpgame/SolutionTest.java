package jumpgame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void should_return_true_given_length_of_num_smaller_than_one() {

        assertTrue(solution.canJump(new int[] {1}) );
    }

    @Test
    void should_return_true_given_normal_success_array() {
        assertTrue(solution.canJump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    void should_return_true_given_normal_fail_array() {
        assertFalse(solution.canJump(new int[]{3, 2, 1, 0, 4}));
    }

    @Test
    void should_return_true_given_all_num_in_nums_is_one() {
        assertTrue(solution.canJump(new int[]{1, 1, 1, 1, 1}));
    }



}