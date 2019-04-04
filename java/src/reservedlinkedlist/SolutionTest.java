package reservedlinkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest {

    @Test
    void should_return_node_val_when_to_string_given_single_node(){
        ListNode l = new ListNode(1);
        assertEquals("1-", l.toString());
    }

    @Test
    void should_return_all_node_val_string_when_to_string_after_append_nodes(){
        int [] vals = {1, 2, 3, 4, 5};
        ListNode l = new ListNode(0);
        l.appendNodes(vals);
        assertEquals("0-1-2-3-4-5-", l.toString());
    }

}

class SolutionTest{
    @Test
    void should_reversed_when_reverse_list_given_single_node(){
        ListNode node = new ListNode(2);
        ListNode reversedNode = new Solution().reverseList(node);
        assertEquals("2-",reversedNode.toString() );
    }
    @Test
    void should_reversed_when_reverse_list_given_mutiple_node(){
        ListNode node = new ListNode(2);
        node.appendNodes(new int[]{3, 4, 5, 6, 7});

        ListNode reversedNode = new Solution().reverseList(node);

        assertEquals("7-6-5-4-3-2-", reversedNode.toString());
    }

}