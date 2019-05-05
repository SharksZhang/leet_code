package addtwonumbersii;

/**
 * 445. Add Two Numbers II
 * Medium
 * You are given two non-empty linked lists representing two non-negative integers.
 * The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Follow up:
 * What if you cannot modify the input lists? In other words, reversing the lists is not allowed.
 *
 * Example:
 *
 * Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 8 -> 0 -> 7
 */

import datastructue.ListNode;

import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode resCur = result;

        Stack<ListNode> stack1 = createStack(l1);
        Stack<ListNode> stack2 = createStack(l2);
        while (!stack1.empty() && ! stack2.empty()){

        }

        int carry = (l1.val +l2.val) / 10;
        int curVal = (l1.val + l2.val)%10;

        if (carry != 0) {
            resCur.next  = new ListNode(carry);
            resCur = resCur.next;
        }
        resCur.next = new ListNode(curVal);
        return result.next;
    }

    private Stack<ListNode> createStack(ListNode l1) {
        Stack<ListNode> stack = new Stack<>();
        while (l1 != null) {
            stack.push(l1);
            l1 = l1.next;
        }
        return stack;
    }
}