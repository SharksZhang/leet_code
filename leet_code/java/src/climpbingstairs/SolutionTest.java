package climpbingstairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void climbStairs() {
        assertEquals(2, new Solution().climbStairs(2));
        assertEquals(3, new Solution().climbStairs(3));
        assertEquals(5, new Solution().climbStairs(4));
    }
}