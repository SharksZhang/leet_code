package copylistwithrandompointer;

/**
 * Input:
 * {"$id":"1","next":{"$id":"2","next":null,"random":{"$ref":"2"},"val":2},"random":{"$ref":"2"},"val":1}
 *
 * Explanation:
 * Node 1's value is 1, both of its next and random pointer points to Node 2.
 * Node 2's value is 2, its next pointer points to null and its random pointer points to itself.
 */


import java.util.HashMap;

/**
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
class Solution {
    public Node copyRandomList(Node head) {
        Node cur = head;
        HashMap<Node, Integer> sourceIndexNodeRela = new HashMap<>(10);
        HashMap<Integer, Integer> sourceIndexRandom = new HashMap<>(10);

        int index = 0;
        while(cur != null){
            sourceIndexNodeRela.put(cur, index);
            cur = cur.next;
            index ++;
        }

        cur = head;
        index = 0;
        while (cur != null){
            sourceIndexRandom.put(index, sourceIndexNodeRela.get(cur.random));
            cur = cur.next;
            index ++;
        }

        Node newHead = new Node();
        Node newCur = newHead;
        HashMap<Integer, Node>  targetIndexNode = new HashMap<>(10);
        cur = head;
        index = 0;
        while (cur != null){
            newCur.next = new Node(cur.val, null, null);
            newCur = newCur.next;
            targetIndexNode.put(index, newCur);
            index ++;
            cur = cur.next;
        }

        index = 0;
        newCur = newHead.next;
        while (newCur != null){
            newCur.random = targetIndexNode.get(sourceIndexRandom.get(index));
            newCur = newCur.next;
            index ++;
        }
        return newHead.next;
    }
}

class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
}