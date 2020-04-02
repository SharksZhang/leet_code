package removekdigits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void givenNormalStringKIsOne() {
         String nums = "12549";
        int k = 1;
        assertEquals("1249",solution.removeKdigits(nums, k));
    }

    @Test
    void givenNormalStringAndKIsTwo() {
        String nums = "1352497";
        int k = 2;
        assertEquals("12497",solution.removeKdigits(nums, k));
    }

    @Test
    void givenAnIncrementString() {
        String nums = "12549";
        int k = 2;
        assertEquals("124",solution.removeKdigits(nums, k));
    }
    @Test
    void givenStringStartWithZero() {
        String nums = "102549";
        int k = 2;
        assertEquals("249",solution.removeKdigits(nums, k));
    }

    @Test
    void givenStringStartWithZeroAndKisOne() {
        String nums = "10200";
        int k = 1;
        assertEquals("200",solution.removeKdigits(nums, k));
    }

    @Test
    void givenStringStringLengthEqualWithK() {
        String nums = "020";
        int k = 3;
        assertEquals("0",solution.removeKdigits(nums, k));
    }


    @Test
    void test1() {
        String nums = "10";
        int k = 2;
        assertEquals("0",solution.removeKdigits(nums, k));
    }







}