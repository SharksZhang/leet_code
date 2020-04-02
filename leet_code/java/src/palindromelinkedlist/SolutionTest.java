package palindromelinkedlist;

import datastructue.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void shouldReturnMidOfTheListWhenOdd() {
        ListNode node = new ListNode(1);
        node.appendNodes(new int[]{2, 3});
        ListNode midNode = solution.getMid(node);
        assertEquals("2", midNode.toString());
    }

    @Test
    void shouldReturnMidOfTheListWhenEvenNode() {
        ListNode node = new ListNode(1);
        node.appendNodes(new int[]{2, 3, 4});
        ListNode midNode = solution.getMid(node);
        assertEquals("2", midNode.toString());
    }

    @Test
    void shouldReturnReversedList() {
        ListNode node = new ListNode(1);
        node.appendNodes(new int[]{2, 3, 4});
        ListNode reversed = solution.reverse(node);
        assertEquals("4-3-2-1-", reversed.LinkedListString());
    }

    @Test
    void shouldReturnTrueWhenTwoListEqual(){
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(1);
        int[] arr = new int[]{2, 3, 4,};
        node2.appendNodes(arr);
        node.appendNodes(arr);
        assertTrue(solution.isEqual(node, node2));
    }
    @Test
    void shouldReturnTrueWhenTwoListEqualAndLongerOneNode(){
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(1);
        int[] arr = new int[]{2, 3, 4,};
        node2.appendNodes(new int[]{5});
        node2.appendNodes(arr);
        node.appendNodes(arr);
        assertTrue(solution.isEqual(node, node2));
    }

    @Test
    void shouldReturnFalseWhenTwoListNotEqual(){
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(1);
        int[] arr = new int[]{2, 3, 4,};
        node2.appendNodes(new int[]{3, 5});
        node.appendNodes(arr);
        assertFalse(solution.isEqual(node, node2));
    }

    @Test
    void shouldReturnTrueWhenIsPalindromeGivenOddNode(){
        ListNode node = new ListNode(1);
        int[] arr = new int[]{2, 3, 2, 4,};
        node.appendNodes(arr);
        assertFalse(solution.isPalindrome(node  ));
    }

    @Test
    void shouldReturnTrueWhenIsPalindromeGivenEvenNode(){
        ListNode node = new ListNode(1);
        int[] arr = new int[]{2,2, 4,};
        node.appendNodes(arr);
        assertFalse(solution.isPalindrome(node));
    }

    @Test
    void shouldReturnTrueWhenIsPalindromeGivenOneNode(){
        ListNode node = new ListNode(1);
        assertTrue(solution.isPalindrome(node));
    }

    @Test
    void shouldReturnFalseWhenIsPalindromeGivenNull(){
        ListNode node = null;
        assertTrue(solution.isPalindrome(node));
    }

    @Test
    void shouldReturnFalseWhenIsNotPalindrome(){
        ListNode node = new ListNode(1);
        int[] arr = new int[]{2 , 3, 4,};
        node.appendNodes(arr);
        assertFalse(solution.isPalindrome(node));
    }







}