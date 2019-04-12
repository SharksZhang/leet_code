package Intersectionoftwolinkedlists;

import datastructue.ListNode;


public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLinkedListLength(headA);
        int lenB = getLinkedListLength(headB);
        if (lenA > lenB){
            headA = move(headA, lenA - lenB);
        }else {
            headB = move(headB, lenB - lenA);
        }
        while (headA != null && headB != null){
            if (headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;

        }
        return null;
    }

    public int getLinkedListLength(ListNode node) {
        int len = 0;
        while (node != null){
            len++;
            node = node.next;
        }
        return len;
    }

    public ListNode move(ListNode node, int step) {
        while (step > 0){
            step --;
            node = node.next;
        }
        return node;
    }
}