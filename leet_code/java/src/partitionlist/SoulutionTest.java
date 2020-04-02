package partitionlist;

import datastructue.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SoulutionTest {
    Solution solution = new Solution();
    @Test
    void shouldBePartitioned() {

        ListNode l1 = new ListNode(1);
        l1.appendNodes(new int[]{4, 3, 2, 5, 2});
        ListNode res = solution.partition(l1, 3);

        assertEquals("1-2-2-4-3-5-",res.LinkedListString());

    }

    @Test
    void shouldReturnListWhenAllNodeGreaterThanX(){
        ListNode l1 = new ListNode(4);
        l1.appendNodes(new int[]{8, 9, 7, 6});
        ListNode res = solution.partition(l1, 2);
        assertEquals(l1.LinkedListString(), res.LinkedListString());

    }
}
