package removelinkedlistelements;

import datastructue.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void shouldReturnOriginGivenNeedNotDelete() {
        ListNode node = new ListNode(0);
        node.appendNodes(new int[]{2, 3, 4, 5});
        assertEquals("0-2-3-4-5-", solution.removeElements(node, 6).LinkedListString());
    }

    @Test
    void givenListNeedDelete() {
        ListNode node = new ListNode(1);
        node.appendNodes(new int[]{2, 2, 3, 4});
        assertEquals("1-3-4-", solution.removeElements(node, 2).LinkedListString());
    }

    @Test
    void givenListNodeTheSame() {
        ListNode node = new ListNode(2);
        node.appendNodes(new int[]{2, 2, 2, 2});
        assertNull(solution.removeElements(node, 2));
    }

    @Test
    void givenListNodeTailTheSame() {
        ListNode node = new ListNode(1);
        node.appendNodes(new int[]{3, 3, 3, 3, 3,});
        assertEquals("1-", solution.removeElements(node, 3).LinkedListString());
    }


    @Test
    void givenListNodeHeadTheSame() {
        ListNode node = new ListNode(3);
        node.appendNodes(new int[]{3, 3, 3, 3, 1,});
        assertEquals("1-", solution.removeElements(node, 3).LinkedListString());
    }



}