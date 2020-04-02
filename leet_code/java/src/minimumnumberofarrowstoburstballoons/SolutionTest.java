package minimumnumberofarrowstoburstballoons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void should_return_zero_when_points_is_empty() {
        assertEquals(0, solution.findMinArrowShots(new int[][]{}));
    }

    @Test
    void should_return_2_given_normal_points() {
        assertEquals(2, solution.findMinArrowShots(new int[][]{{10, 16}, {2, 8},{1, 6}, {7, 12}}));
    }

    @Test
    void should_return_1_given_max_and_min_integer() {
        assertEquals(1, solution.findMinArrowShots(new int[][]{{-2147483648,2147483647}}));
    }

    @Test
    void should_return_2_given_normal_points2() {
        assertEquals(2, solution.findMinArrowShots(new int[][]{{3, 9}, {7, 12},{3, 8}, {9, 10},{2, 9}, {0,9},{3, 9}, {0, 6}, {2, 8}}));
    }



}