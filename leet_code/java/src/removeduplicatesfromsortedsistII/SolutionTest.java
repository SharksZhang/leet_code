
package removeduplicatesfromsortedsistII;

import datastructue.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    @Test
    void givenDuplicatesNotExist(){
        ListNode l = new ListNode(1);
        l.appendNodes(new int[]{2, 3, 4, 5});
        l = solution.deleteDuplicates(l);
        assertEquals(l.LinkedListString(), "1-2-3-4-5-");
    }

    @Test
    void givenDuplicatesAtMiddle(){
        ListNode l = new ListNode(1);
        l.appendNodes(new int[]{2, 2, 3, 4, 5});
        l = solution.deleteDuplicates(l);
        assertEquals( "1-3-4-5-", l.LinkedListString());
    }

    @Test
    void givenDuplicatesAll(){
        ListNode l = new ListNode(1);
        l.appendNodes(new int[]{1});
        l = solution.deleteDuplicates(l);
        assertNull(l);
    }

    @Test
    void givenDuplicatesAtStart(){
        ListNode l = new ListNode(1);
        l.appendNodes(new int[]{1, 1, 2, 3, 4});
        l = solution.deleteDuplicates(l);
        assertEquals("2-3-4-", l.LinkedListString());
    }

    @Test
    void givenDuplicatesAtEnd(){
        ListNode l = new ListNode(1);
        l.appendNodes(new int[]{2, 3, 4, 4, 4});
        l = solution.deleteDuplicates(l);
        assertEquals("1-2-3-", l.LinkedListString());
    }


}