package SearchInsertPosition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void searchInsert() {
        assertEquals(0, new Solution().searchInsert(new int[]{1, 3, 5, 6}, 0));
    }
}