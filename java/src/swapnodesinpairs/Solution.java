package swapnodesinpairs;
import datastructue.ListNode;
/**
 * 24. Swap Nodes in Pairs
 * Given a linked list, swap every two adjacent nodes and return its head.
 *
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 *
 *
 *
 * Example:
 *
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode fakeHead = new ListNode(0);
        ListNode cur = fakeHead;
        while (head != null && head.next != null){
            ListNode first = head;
            ListNode second = head.next;
            head = second.next;
            cur.next = second;
            second.next= first;
            cur = first;
        }
        cur.next = null;

        if (head != null){
            cur.next = head;
        }
        return fakeHead.next;
    }
}