package coinchange;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void coinChange() {
        assertEquals(3, new Solution().coinChange(new int[]{1, 2, 5}, 11));
        assertEquals(-1, new Solution().coinChange(new int[]{3, 2, 5}, 1));
    }
}