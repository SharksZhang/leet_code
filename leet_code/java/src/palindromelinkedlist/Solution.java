package palindromelinkedlist;

/**
 * 234. Palindrome Linked List
 * Given a singly linked list, determine if it is a palindrome.
 *
 * Example 1:
 *
 * Input: 1->2
 * Output: false
 * Example 2:
 *
 * Input: 1->2->2->1
 * Output: true
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode mid = getMid(head);
        ListNode secondHalf = reverse(mid.next);

        return isEqual(head, secondHalf);
    }

    public ListNode getMid(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head) {

        ListNode newHead = null;
        while (head != null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    public boolean isEqual(ListNode node1, ListNode node2) {
        while (node1 != null && node2 !=null){
            if (node1.val != node2.val){
                return false;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        return true;
    }
}