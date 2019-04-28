package mergetwosortedsists;

import datastructue.ListNode;

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 *
 * Example:
 *
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode mergedHead = new ListNode(0);
        ListNode mergedCur = mergedHead;
        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                mergedCur.next = l1;
              mergedCur = mergedCur.next;
                l1 = l1.next;
            }else {
                mergedCur.next = l2;
                mergedCur = mergedCur.next;
                l2 = l2.next;
            }
        }
        if (l1 != null){
            mergedCur.next = l1;
        }
        if (l2 != null){
            mergedCur.next = l2;
        }

        return mergedHead.next;
    }
}