package reservedlinkedlist;

/**
 * Definition for singly-linked list.
 */

public class ListNode {
    private int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    void appendNodes(int[] vals) {
        ListNode cur = this;
        for (int val : vals) {
            cur.next = new ListNode(val);
            cur = cur.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        ListNode p = this;
        while (p != null) {
            result.append(p.val).append("-");
            p = p.next;
        }
        return result.toString();
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while (head != null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}