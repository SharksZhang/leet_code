package besttimetobuyandsellstockII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void should_retrn_7_when_given_a_norma_nums() {
        assertEquals(7, solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void should_retrn__when_given_a_increase_list() {
        assertEquals(4, solution.maxProfit(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void should_retrn_when_given_a_decrease_list() {
        assertEquals(0, solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    void should_retrn_when_given_a_increase_then_decrease_list() {
        assertEquals(6, solution.maxProfit(new int[]{7,1, 5,  6, 3, 4}));
    }

    @Test
    void should_retrn_when_given_a_increase_then_decrease_list2() {
        assertEquals(2, solution.maxProfit(new int[]{2,1, 2, 0, 1}));
    }





}