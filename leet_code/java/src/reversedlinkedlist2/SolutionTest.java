package reversedlinkedlist2;

import datastructue.ListNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class SolutionTest {
    private ListNode node;
    private Solution solution = new Solution();

    @BeforeEach
    void setUp(){
        node = new ListNode(1);
        node.appendNodes(new int[]{2, 3, 4, 5,});
    }

    @Test
    void shouldReturnCorrectNodeWhenFindNthNode() {
        ListNode resNode = solution.findNthNode(node, 2);
        assertEquals("2", resNode.toString());
    }

    @Test
    void shouldReversedWhenMGreaterThan1(){
        ListNode resNode = solution.reverseBetween(node, 2, 4);
        assertEquals("1-4-3-2-5-", resNode.LinkedListString());
    }

    @Test
    void shouldReversedWhenMEqualTo1(){
        ListNode resNode = solution.reverseBetween(node, 1, 5);
        assertEquals("5-4-3-2-1-", resNode.LinkedListString());
    }

    @Test
    void shouldReversedWhenNEqualMaxLength(){
        ListNode resNode = solution.reverseBetween(node, 3, 5);
    }

}
