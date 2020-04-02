package jumpgameII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void given_nums_with_two_steps() {
        assertEquals(2, solution.jump(new int[]{2, 3, 1, 1, 4}));
    }
    @Test
    void given_nums_with_four_step() {
        assertEquals(4, solution.jump(new int[]{1, 1, 1, 1, 4}));
    }

    @Test
    void given_nums_with_one_step() {
        assertEquals(1, solution.jump(new int[]{6, 1, 1, 1, 4}));
    }


}