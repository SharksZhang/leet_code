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
        Stack<ListNode> stack1 = createStack(l1);
        Stack<ListNode> stack2 = createStack(l2);
        Stack<ListNode> resultStack = new Stack<>();
        int carry = calculate(stack1, stack2, resultStack);
        carry = calculateRemainingNode(resultStack, carry, stack1.isEmpty() ? stack2 : stack1);

        if (carry != 0) {
            resultStack.push(new ListNode(carry));
        }

        return createListFromStack(resultStack);
    }

    private int calculate(Stack<ListNode> stack1, Stack<ListNode> stack2, Stack<ListNode> resultStack) {
        int carry = 0;
        while (!stack1.empty() && !stack2.empty()){
            ListNode node1 = stack1.pop();
            ListNode node2 = stack2.pop();
            ListNode resultNode = new ListNode(computeResNodeVal(computeOneDigitResult(carry, node1, node2)));
            resultStack.push(resultNode);
            carry = computeCarryOn(computeOneDigitResult(carry, node1, node2));
        }
        return carry;
    }

    private int calculateRemainingNode(Stack<ListNode> resultStack, int carry, Stack<ListNode> tmpStack) {
        while (!tmpStack.isEmpty()) {
            ListNode node = tmpStack.pop();
            resultStack.push(new ListNode(computeResNodeVal(node.val + carry)));
            carry = computeCarryOn(node.val + carry);
        }
        return carry;
    }

    private int computeCarryOn(int i) {
        return (i) / 10;
    }

    private int computeResNodeVal(int i) {
        return i % 10;
    }

    private int computeOneDigitResult(int carry, ListNode node1, ListNode node2) {
        return carry + node1.val + node2.val;
    }

    private ListNode createListFromStack(Stack<ListNode> resultStack) {
        ListNode head = new ListNode(0);
        ListNode cur = head;

        while (!resultStack.isEmpty()){
            cur.next = resultStack.pop();
            cur = cur.next;
        }

        return head.next;
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