package minimumpathsum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void minPathSum() {
        assertEquals(7, new Solution().minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}) );
        assertEquals(6, new Solution().minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}}) );
        assertEquals(0, new Solution().minPathSum(new int[][]{}) );
        assertEquals(1, new Solution().minPathSum(new int[][]{{1}}) );
        assertEquals(0, new Solution().minPathSum( null ));
    }
}