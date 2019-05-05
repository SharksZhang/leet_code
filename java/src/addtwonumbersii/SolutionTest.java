package addtwonumbersii;

import datastructue.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void givenSingleDigit() {
        ListNode number1 = new ListNode(1);
        ListNode number2 = new ListNode(2);
        assertEquals("3", solution.addTwoNumbers(number1, number2).toString());
    }

    @Test
    void givenSingleDigitWithCarry() {
        ListNode number1 = new ListNode(8);
        ListNode number2 = new ListNode(9);
        assertEquals("1-7-", solution.addTwoNumbers(number1, number2).LinkedListString());
    }

    @Test
    void givenDuplicateDigitWithCarry() {
        ListNode number1 = new ListNode(118);
        ListNode number2 = new ListNode(9);
        assertEquals("1-2-7-", solution.addTwoNumbers(number1, number2).LinkedListString());
    }

}