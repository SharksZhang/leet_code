package splitlinkedlistinparts;

import datastructue.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void shouldReturnLengthOfList() {
        ListNode l = new ListNode(0);
        l.appendNodes(new int[]{2, 3, 4});
        assertEquals(4, solution.lengthOfList(l));
    }

    @Test
    void shouldReturnSingleNodeArrGivenLengthSmallerThanKOrEqual() {
        ListNode l = new ListNode(0);
        l.appendNodes(new int[]{2, 3, 4});
        ListNode[] listExpect = new ListNode[]{new ListNode(0), new ListNode(2),
                new ListNode(3), new ListNode(4), null};
        ListNode[] resList = solution.splitListToParts(l, 5);
        for (int i = 0; i < listExpect.length -1 ; i++) {
            assertEquals(listExpect[i].toString(),resList[i].toString());
        }
        assertNull(resList[4]);

    }

    @Test
    void shouldReturnGivenKSmallerLength() {
        ListNode l = new ListNode(1);
        l.appendNodes(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10});

        ListNode[] resList = solution.splitListToParts(l, 3);
        assertEquals("1-2-3-4-", resList[0].LinkedListString());
        assertEquals("5-6-7-", resList[1].LinkedListString());
        assertEquals("8-9-10-", resList[2].LinkedListString());

    }

    @Test
    void shouldReturnGivenKSmallerLengthAndLengthTimesK() {
        ListNode l = new ListNode(1);
        l.appendNodes(new int[]{2, 3, 4, 5, 6, 7, 8, 9});

        ListNode[] resList = solution.splitListToParts(l, 3);
        assertEquals("1-2-3-", resList[0].LinkedListString());
        assertEquals("4-5-6-", resList[1].LinkedListString());
        assertEquals("7-8-9-", resList[2].LinkedListString());

    }

}