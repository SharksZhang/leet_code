package courseschedule;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {

    @Test
    void canFinish() {
        int[][] input = {{1, 0},};
        assertEquals(true, new Solution1().canFinish(2, input));
    }

    @Test
    void canFinish2() {
        int[][] input = {{1, 0},{0, 1}};
        assertEquals(false, new Solution1().canFinish(2, input));
    }

    @Test
    void canFinish3() {
        int[][] input = {{0, 1}, {0, 2},{1, 2}};
        assertEquals(true, new Solution1().canFinish(3, input));
    }
}