package binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void should_return_index_given_target_in_list() {
        assertEquals(4, solution.search( new int[]{-1, 0 ,3, 5, 9, 12}, 9));
    }

    @Test
    void given_target_not_in_list() {
        assertEquals(-1, solution.search( new int[]{-1, 0 ,3, 5, 9, 12}, 2));
    }

    @Test
    void given_a_num_list() {
        assertEquals(0, solution.search( new int[]{ 5}, 5));
    }
    @Test
    void given_two_nums_list() {
        assertEquals(1, solution.search( new int[]{ 2, 5}, 5));
    }


}