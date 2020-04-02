package reversedlinkedlist;

import datastructue.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest{
    @Test
    void shouldReversedWhenReverseListGivenSingleNode(){
        ListNode node = new ListNode(2);
        ListNode reversedNode = new Solution().reverseList(node);
        assertEquals("2-",reversedNode.LinkedListString() );
    }
    @Test
    void shouldReversedWhenReverseListGivenMultipleNode(){
        ListNode node = new ListNode(2);
        node.appendNodes(new int[]{3, 4, 5, 6, 7});

        ListNode reversedNode = new Solution().reverseList(node);

        assertEquals("7-6-5-4-3-2-", reversedNode.LinkedListString());
    }

}