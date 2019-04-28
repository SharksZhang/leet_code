package removeduplicatesfromsortedlist;

import datastructue.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void shouldReturnOriginWhenGivenListNotDuplicate(){
        ListNode list = new ListNode(1);
        list.appendNodes(new int[]{2,3});
        solution.deleteDuplicates(list);
        assertEquals("1-2-3-", list.LinkedListString());
    }

    @Test
    void shouldReturnNoneDuplicateListGivenOneDuplicate(){
        ListNode list = new ListNode(1);
        list.appendNodes(new int[] {1, 2,});
        solution.deleteDuplicates(list);
        assertEquals("1-2-", list.LinkedListString());
    }

    @Test
    void shouldReturnNoneDuplicateListGivenTwoDuplicate(){
        ListNode list = new ListNode(1);
        list.appendNodes(new int[] {1, 3, 3, 3, 4});
        solution.deleteDuplicates(list);
        assertEquals("1-3-4-", list.LinkedListString());
    }

    @Test
    void shouldReturnNoneDuplicateListGivenOneNode(){
        ListNode list = new ListNode(1);
        solution.deleteDuplicates(list);
        assertEquals("1-", list.LinkedListString());
    }

}