
'''
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
'''

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None


class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        carry = 0
        p = l1
        q = l2
        head = ListNode(0)
        cur = head
        while p != None and q != None:
            sum = p.val + q.val + carry
            carry = sum // 10
            print("b" + str(carry))
            cur.next = ListNode(sum%10)
            cur = cur.next
            p= p.next
            q= q.next
        print(carry)
        while p != None:
            cur.next = ListNode((p.val + carry) % 10)
            carry = (p.val + carry)//10
            cur = cur.next
            p = p.next

        while q != None:
            carry = (q.val + carry)//10
            cur.next = ListNode((q.val + carry) % 10)
            cur = cur.next
            q = q.next
        if carry != 0 :
            cur.next = ListNode(carry)
        return head.next


class ListNodeUtil:

    def createLinkedList(*args):
        head = ListNode(0)
        if len(args) > 0:
            p = ListNode(args[0])
            head.next = p

        for arg in args[1:]:
            q = ListNode(arg)
            p.next = q
            p = p.next
        return head.next


    def printLinkedList(listNode):
        p = listNode
        result = ""
        while p != None:
            result = str(result) + "  "+ str(p.val)
            p = p.next
        print(result)

    def isListNodeValueEqual(listNode, *args):
        p = listNode
        for val in args:
            if val != p.val:
                return False
            p = p.next
        return True


if __name__ == '__main__':
    solution = Solution()
    result = solution.addTwoNumbers(1, 2)
    print(result)
