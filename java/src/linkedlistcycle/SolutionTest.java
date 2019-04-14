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
        node1.appendNodes(new int[]{2, 4, 6, 7});

        node1.getLastNode().next = node1;
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
