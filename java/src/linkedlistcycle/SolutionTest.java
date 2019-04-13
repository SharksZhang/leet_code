package linkedlistcycle;

import datastructue.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * spend time : 23:36.99
 */
public class SolutionTest {
    Solution solution = new Solution();
    @Test
    void shouldBeTrueWhenCycleExist(){
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

        assertTrue(solution.hasCycle(node1));
    }

    @Test
    void shouldBeFalseWhenHasOnlyOneNode(){
        ListNode node = new ListNode(1);
        assertFalse(solution.hasCycle(node));
    }

    @Test
    void shouldBeFalseWhenCycleNotExist(){
        ListNode node = new ListNode(1);
        node.appendNodes(new int[] {3, 4, 5, 6});
        assertFalse(solution.hasCycle(node));
    }

    @Test
    void shouldBeFalseWhenNodeIsNull(){
        assertFalse(solution.hasCycle(null));
    }
}
