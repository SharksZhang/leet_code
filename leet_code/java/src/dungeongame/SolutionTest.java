package dungeongame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void calculateMinimumHP() {
        assertEquals(7, new Solution().calculateMinimumHP(new int[][]{{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}}) );
        assertEquals(6, new Solution().calculateMinimumHP(new int[][]{{-2, -3, 3}}) );
        assertEquals(1, new Solution().calculateMinimumHP(new int[][]{{0}}) );
        assertEquals(3, new Solution().calculateMinimumHP(new int[][]{{-2}}) );
        assertEquals(1, new Solution().calculateMinimumHP(new int[][]{{100}}) );


    }
}