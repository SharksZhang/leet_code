package reorderlist;

/**
 * 143. Reorder List
 * Share
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln,
 * reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
 *
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 *
 * Example 1:
 *
 * Given 1->2->3->4, reorder it to 1->4->2->3.
 * Example 2:
 *
 * Given 1->2->3->4->5, reorder it to 1->5->2->4->3.
 */

import datastructue.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode midNode = getMidNode(head);

        ListNode secondHalf = reverseList(midNode.next);
        midNode.next = null;

        head = mergeList(head, secondHalf);


    }

    private ListNode mergeList(ListNode head, ListNode midNode) {
        ListNode fakeHead = new ListNode(0);
        ListNode cur = fakeHead;
        while (head != null && midNode != null  ){
            ListNode tmpNode = head;
            head = head.next;
            cur.next = tmpNode;

            tmpNode = midNode;
            midNode = midNode.next;
            cur.next.next = tmpNode;

            cur = cur.next.next;
        }
        if (head != null) {
            cur.next = head;
        }
        return fakeHead.next;
    }

    private ListNode getMidNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}

