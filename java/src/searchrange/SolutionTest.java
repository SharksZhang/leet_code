package searchrange;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void searchRange() {
        assertArrayEquals(new int[]{3, 4}, new Solution().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
    }
}