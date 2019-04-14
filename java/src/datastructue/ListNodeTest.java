package datastructue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ListNodeTest {
    @Test
    void should_return_node_val_when_Linked_string_given_single_node(){
        ListNode l = new ListNode(1);
        assertEquals("1-", l.LinkedListString());
    }

    @Test
    void should_return_all_node_val_string_when_linked_string_after_append_nodes(){
        int [] vals = {1, 2, 3, 4, 5};
        ListNode l = new ListNode(0);
        l.appendNodes(vals);
        assertEquals("0-1-2-3-4-5-", l.LinkedListString());
    }

    @Test
    void should_return_val_when_to_string(){
        ListNode l = new ListNode(1);
        assertEquals("1", l.toString());
    }

    @Test
    void shouldReturnLastNodeWhenGetLastNode(){
        ListNode l = new ListNode(1);
        assertEquals(l, l.getLastNode());

        ListNode node2 = new ListNode(2);
        l.next = node2;
        assertEquals(node2, l.getLastNode());

    }

}
