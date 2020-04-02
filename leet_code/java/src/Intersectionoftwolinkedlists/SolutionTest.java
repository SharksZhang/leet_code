package Intersectionoftwolinkedlists;

import datastructue.ListNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    ListNode common;
    ListNode l1;

    @BeforeEach
    void setUpEach() {

        common = new ListNode(5);
        common.appendNodes(new int[]{7, 8, 9});

        l1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        l1.next = node2;
        node2.next = common;
    }

    @Test
    void shouldReturnCorrectLengthWhenGetLinkedListLength(){
        assertEquals(4, solution.getLinkedListLength(common));
    }

    @Test
    void shouldReturn0WhenGetLinkedListLengthGivenNodeNull(){
        assertEquals(0, solution.getLinkedListLength(null));
    }

    @Test
    void shouldReturnTheNodeAfterMoveNSteps(){
        ListNode afterMove = solution.move(l1, 2);
        assertEquals(common, afterMove);
    }

    @Test
    void shouldReturnCurrentNodeAfterMove0Step(){
        ListNode node = new ListNode(2);
        node.appendNodes(new int[]{3, 3});
        assertEquals(node, solution.move(node, 0));
    }

    @Test
    void shouldReturntIntersectionNode() {
        ListNode l2 = new ListNode(2);
        l2.next = common;

        ListNode interSecNode = solution.getIntersectionNode(l1, l2);
        assertEquals(common, interSecNode);
    }

    @Test
    void shouldReturnFirstNodeGivenTheSameList(){
        assertEquals(common, solution.getIntersectionNode(common, common));
    }

    @Test
    void shouldReturnNullWhenDoesNotHaveIntersectionNode(){
        ListNode l2 = new ListNode(2);
        l2.appendNodes(new int[]{2, 4, 7});

        assertNull(solution.getIntersectionNode(l1, l2));
    }

    @Test
    void shouldReturnNullWhenL2IsNull(){
        assertNull(solution.getIntersectionNode(l1, null));
    }


}