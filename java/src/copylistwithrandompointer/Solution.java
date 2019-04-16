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

        HashMap<Node, Integer> sourceIndexNodeRela = getNodeIndexMap(head);

        HashMap<Integer, Integer> sourceIndexRandom = getIndexRandomMap(head, sourceIndexNodeRela);

        Node newHead = copyListWithoutRandom(head);

        HashMap<Integer, Node>  targetIndexNode = getIndexNodeMap(newHead);

        return fillRandom(newHead, targetIndexNode, sourceIndexRandom);
    }

    private HashMap<Node,Integer> getNodeIndexMap(Node cur ){
        HashMap<Node, Integer> sourceIndexNodeRela = new HashMap<>(10);
        int index = 0;
        while(cur != null){
            sourceIndexNodeRela.put(cur, index);
            cur = cur.next;
            index ++;
        }
        return sourceIndexNodeRela;
    }

    private HashMap<Integer, Integer> getIndexRandomMap(Node cur, HashMap<Node, Integer> sourceIndexNodeRela){
        HashMap<Integer, Integer> sourceIndexRandom = new HashMap<>(10);
        int index = 0;
        while (cur != null){
            sourceIndexRandom.put(index, sourceIndexNodeRela.get(cur.random));
            cur = cur.next;
            index ++;
        }
        return sourceIndexRandom;
    }

    private Node  copyListWithoutRandom(Node cur){
        Node newHead = new Node();
        Node newCur = newHead;
        while (cur != null){
            newCur.next = new Node(cur.val, null, null);
            newCur = newCur.next;
            cur = cur.next;
        }
        return newHead.next;
    }

    private HashMap<Integer, Node> getIndexNodeMap(Node cur){
        HashMap<Integer, Node>  targetIndexNode = new HashMap<>(10);
        int index = 0;
        while (cur != null){
            targetIndexNode.put(index, cur);
            index ++;
            cur = cur.next;
        }
        return targetIndexNode;
    }

    private Node fillRandom(Node head, HashMap<Integer, Node>  targetIndexNode, HashMap<Integer, Integer> sourceIndexRandom ){
        Node newCur = head;
        int index = 0;
        while (newCur != null){
            newCur.random = targetIndexNode.get(sourceIndexRandom.get(index));
            newCur = newCur.next;
            index ++;
        }
        return head;
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