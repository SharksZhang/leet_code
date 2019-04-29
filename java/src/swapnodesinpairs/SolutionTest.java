package swapnodesinpairs;

import datastructue.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class SolutionTest {
    Solution solution = new Solution();

    @Test
    void givenEvenNodes(){
        ListNode l = new ListNode(1);
        l.appendNodes(new int[]{2, 3, 4, });
        l = solution.swapPairs(l);
        assertEquals("2-1-4-3-", l.LinkedListString());
    }

    @Test
    void givenOddNodes(){
        ListNode l = new ListNode(1);
        l.appendNodes(new int[]{7, 8, 9, 3});
        assertEquals("7-1-9-8-3-", solution.swapPairs(l).LinkedListString());
    }

}