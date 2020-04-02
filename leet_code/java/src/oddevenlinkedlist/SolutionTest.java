package oddevenlinkedlist;

import datastructue.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void ReturnOddEvenLinkedList() {
        ListNode l = new ListNode(1);
        l.appendNodes(new int[]{2, 3, 4, 5,});
        l = solution.oddEvenList(l);
        assertEquals("1-3-5-2-4-", l.LinkedListString());
    }

    @Test
    void ReturnOddEvenLinkedList2() {
        ListNode l = new ListNode(2);
        l.appendNodes(new int[]{1, 3, 5, 6, 4, 7});
        l = solution.oddEvenList(l);
        assertEquals("2-3-6-7-1-5-4-", l.LinkedListString());
    }

    @Test
    void ReturnOddEvenLinkedList3() {
        ListNode l = new ListNode(1);
        l.appendNodes(new int[]{2, 3, 4, 5, 6, 7, 8});
        l = solution.oddEvenList(l);
        assertEquals("1-3-5-7-2-4-6-8-", l.LinkedListString());
    }


    @Test
    void ReturnOddEvenLinkedListGivenOneNode() {
        ListNode l = new ListNode(2);
        l = solution.oddEvenList(l);
        assertEquals("2-", l.LinkedListString());
    }


    @Test
    void ReturnOddEvenLinkedListGivenNull() {
        ListNode l = null;
        l = solution.oddEvenList(l);
        assertNull(l);
    }


}