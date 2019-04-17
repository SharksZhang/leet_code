package mergetwosortedsists;

import datastructue.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    @Test
    void shouldReturnMergedListWhenMergeTwoNormalLists(){
        ListNode l1 = new ListNode(1);
        l1.appendNodes(new int[]{2, 4});
        ListNode l2 = new ListNode(1);
        l2.appendNodes(new int[]{3, 4});

        ListNode list = solution.mergeTwoLists(l1, l2);
        assertEquals("1-1-2-3-4-4-", list.LinkedListString());

    }
    @Test
    void shouldReturnListTheSameWithL1WhenL2IsNull(){
        ListNode l1 = new ListNode(1);
        l1.appendNodes(new int[]{3,6,7,9});
        assertEquals("1-3-6-7-9-", solution.mergeTwoLists(l1, null).LinkedListString());
    }
}