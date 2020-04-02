package searchinrotatedsortedarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void search() {
        assertEquals(1, new Solution().search(new int[]{5, 1, 3}, 1));
    }
}