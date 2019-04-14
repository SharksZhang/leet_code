package linkedlistCycleII;

import datastructue.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    void shouldReturnTheNodeCycleStartWhenCycleExist(){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(6);
        ListNode node5 = new ListNode(7);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node2;

        assertEquals(node2, solution.detectCycle(node1));
    }

    @Test
    void shouldReturnTheFirstNodeWhenCycleStartAtFirstNode(){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(6);
        ListNode node5 = new ListNode(7);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node1;

        assertEquals(node1, solution.detectCycle(node1));

    }

    @Test
    void shouldReturnNullWhenCycleDoesNotExist(){
        ListNode l1 = new ListNode(0);
        l1.appendNodes(new int[]{1, 2, 3, 4});
        assertNull(solution.detectCycle(l1));
    }

    @Test
    void shouldReturnNullWhenCycleIsNull(){
        assertNull(solution.detectCycle(null));
    }
}
