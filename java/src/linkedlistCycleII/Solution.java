package linkedlistCycleII;

import datastructue.ListNode;

/**
 * @date 2019年04月15日
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode meetAt = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                meetAt = fast;
                break;
            }
        }

        if (meetAt != null) {
            while (head != meetAt) {
                head = head.next;
                meetAt = meetAt.next;
            }
            return meetAt;
        }

        return null;
    }
}