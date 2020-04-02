package longestincreasingsubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void lengthOfLIS() {
        assertEquals(3, new Solution().lengthOfLIS(new int[]{1, 2, 3, 1}));
        assertEquals(0, new Solution().lengthOfLIS(new int[]{}));
        assertEquals(1, new Solution().lengthOfLIS(new int[]{2}));
        assertEquals(4, new Solution().lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}