package removeduplicatesfromsortedsistII;
import datastructue.ListNode;

/**
 * 82. Remove Duplicates from Sorted List II
 * Given a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list.
 *
 * Example 1:
 *
 * Input: 1->2->3->3->4->4->5
 * Output: 1->2->5
 * Example 2:
 *
 * Input: 1->1->1->2->3
 * Output: 2->3
 */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution1 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode pre= preHead;
        ListNode cur = head;
        boolean isCurEqual = false;
        while (cur != null && cur.next != null){
            ListNode next = cur.next;
            if (cur.val == next.val){
                cur.next = next.next;
                isCurEqual =true;
            }else{
                if (isCurEqual) {
                    pre.next = cur.next;
                    cur = pre.next;
                    isCurEqual= false;
                }else {
                    pre = pre.next;
                    cur = cur.next;
                }
            }
        }
        if(isCurEqual){
            pre.next = null;
        }
        return preHead.next;
    }
}