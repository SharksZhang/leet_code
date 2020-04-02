package reversedlinkedlist2;


import datastructue.ListNode;

class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode mThNode = findNthNode(head, m);
        ListNode newM = null;
        int reverseTimes = n-m+1;

        ListNode cur = mThNode;
        while (reverseTimes > 0){
            reverseTimes --;
            ListNode next = cur.next;
            cur.next = newM;
            newM = cur;
            cur = next;
        }
        mThNode.next = cur;
        if (m == 1) {
            return newM;
        }
        findNthNode(head, m -1).next = newM;
        return head;
    }

    /**
     *
     * @param head
     * @param m  > 0
     * @return
     */
    public ListNode findNthNode(ListNode head, int m)  {
        while (head != null && m >1){
            m --;
            head = head.next;
        }
        return head;
    }
}