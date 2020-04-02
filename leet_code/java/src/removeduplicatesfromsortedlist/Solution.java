package removeduplicatesfromsortedlist;

/**
 * 83. Remove Duplicates from Sorted List
 *
 * Share
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * Example 1:
 *
 * Input: 1->1->2
 * Output: 1->2
 * Example 2:
 *
 * Input: 1->1->2->3->3
 * Output: 1->2->3
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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null){
            if (cur.val == pre.val) {
                pre.next = cur.next;
                cur = cur.next;
            }else {
                pre= pre.next;
                cur = cur.next;
            }
        }
        return head;
    }
}