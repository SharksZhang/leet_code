package rotatelist;

import datastructue.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution  = new Solution();

    @Test
    void givenListNeedNotRotate(){
        ListNode l = new ListNode(1);
        l.appendNodes(new int[]{2, 3, 4, 5, 6});
        assertEquals("1-2-3-4-5-6-", solution.rotateRight(l, 0).LinkedListString());
    }
    @Test
    void givenK2(){
        ListNode l = new ListNode(1);
        l.appendNodes(new int[]{2, 3, 4, 5, 6});
        assertEquals("5-6-1-2-3-4-", solution.rotateRight(l, 2).LinkedListString());
    }

    @Test
    void givenK1AndOneNodeList(){
        ListNode l = new ListNode(1);
        assertEquals("1-", solution.rotateRight(l, 1).LinkedListString());
    }

    @Test
    void givenKBiggerThanLinkedListLength(){
        ListNode l = new ListNode(1);
        l.appendNodes(new int[]{2, 3, 4, 6, 7});
        assertEquals("4-6-7-1-2-3-", solution.rotateRight(l, 9).LinkedListString());
    }


    @Test
    void shouldReturnLengthOfList(){
        ListNode l = new ListNode(1);
        l.appendNodes(new int[]{2, 3, 4, 5});
        assertEquals(5, solution.getLinkedListLength(l));
    }

}