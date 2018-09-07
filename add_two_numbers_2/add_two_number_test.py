import unittest
from add_two_numbers_2.add_two_numbers import *

class TestListNodeUtil(unittest.TestCase):

    def test_createLinkedList(self):
        listNode = ListNodeUtil.createLinkedList(9,2,1)
        # ListNodeUtil.printLinkedList(listNode)
        self.assertEqual(listNode.val, 9)
        self.assertEqual(listNode.next.val, 2)
        self.assertEqual(listNode.next.next.val, 1)

    def test_isListNodeValueEqual(self):
        l = ListNodeUtil.createLinkedList(1,2,3)

class TestListNode(unittest.TestCase):
    def test_init(self):
        node = ListNode(1)
        self.assertEqual(node.val, 1)


class TestSolution(unittest.TestCase):

    def test_addTwoNumbersSingleNode(self):
        l1 = ListNodeUtil.createLinkedList(1)
        l2 = ListNodeUtil.createLinkedList(1)
        numbers = Solution().addTwoNumbers(l1, l2)
        self.assertEqual(numbers.val,2)

    def test_addTwoNumbersDuplicateNodeAndSingleNode(self):
        l1 = ListNodeUtil.createLinkedList(1, 2, 3)
        l2 = ListNodeUtil.createLinkedList(1)
        numbers = Solution().addTwoNumbers(l1,l2)
        ListNodeUtil.printLinkedList(numbers)
        equal = ListNodeUtil.isListNodeValueEqual(numbers, 2, 2, 3)
        self.assertTrue(equal)

    def test_addTwoNumbersDuplicateNodeAndDuplicateNode(self):
        l1 = ListNodeUtil.createLinkedList(1, 2, 3)
        l2 = ListNodeUtil.createLinkedList(1, 2, 3, 5)
        numbers = Solution().addTwoNumbers(l1,l2)
        ListNodeUtil.printLinkedList(numbers)
        equal = ListNodeUtil.isListNodeValueEqual(numbers, 2, 4, 6, 5)
        self.assertTrue(equal)

    def test_addTwoNumbersDuplicateNodeAndDuplicateNodeWithCarry(self):
        l1 = ListNodeUtil.createLinkedList(1, 2, 3, 4, 5)
        l2 = ListNodeUtil.createLinkedList(9)
        numbers = Solution().addTwoNumbers(l1,l2)
        ListNodeUtil.printLinkedList(numbers)
        equal = ListNodeUtil.isListNodeValueEqual(numbers, 0, 3, 3, 4, 5)
        self.assertTrue(equal)


    def test_addTwoNumbersDuplicateNodeAndDuplicateNodeWithLastCarry(self):
        l1 = ListNodeUtil.createLinkedList(9, 9, 9)
        l2 = ListNodeUtil.createLinkedList(9, 9, 9, 9, 9)
        numbers = Solution().addTwoNumbers(l1,l2)
        ListNodeUtil.printLinkedList(numbers)
        equal = ListNodeUtil.isListNodeValueEqual(numbers, 8, 9, 9, 0, 0 , 1)
        self.assertTrue(equal)

    def test_addTwoNumbersException(self):
        l1 = ListNodeUtil.createLinkedList(9, 8)
        l2 = ListNodeUtil.createLinkedList(1)
        numbers = Solution().addTwoNumbers(l1,l2)
        ListNodeUtil.printLinkedList(numbers)
        equal = ListNodeUtil.isListNodeValueEqual(numbers, 0, 9)
        self.assertTrue(equal)




