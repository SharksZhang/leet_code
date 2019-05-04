package reorderlist;

import datastructue.ListNode;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();




    @Test
    void shouldReturnReversedList(){
        ListNode node = new ListNode(0);
        node.appendNodes(new int[]{1, 2, 3, 4});
        ListNode nodeExpect = solution.reverseList(node);
        assertEquals("4-3-2-1-0-", nodeExpect.LinkedListString());
    }

    @Test
    void shouldReturnReordedList() {
        ListNode node = new ListNode(1);
        node.appendNodes(new int[]{2, 3, 4});
        solution.reorderList(node);
        assertEquals("1-4-2-3-", node.LinkedListString());
    }

    @Test
    void shouldReturnReordedListWhenOddNode() {
        ListNode node = new ListNode(1);
        node.appendNodes(new int[]{2, 3, 4, 5});
        solution.reorderList(node);
        assertEquals("1-5-2-4-3-", node.LinkedListString());
    }

    @Test
    void shouldReturnReordedListWhenOneNode() {
        ListNode node = new ListNode(1);
        solution.reorderList(node);
        assertEquals("1-", node.LinkedListString());
    }



}