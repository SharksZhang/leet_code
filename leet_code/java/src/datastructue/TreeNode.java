package datastructue;

import java.util.LinkedList;

public class TreeNode {
    public  int val;
    public  TreeNode left;
    public  TreeNode right;

    public  TreeNode(int x) {
        val = x;
    }

    public int [] levelTraverse(){
        LinkedList<TreeNode> l = new LinkedList<>();
        LinkedList<TreeNode> result = new LinkedList<>();
        l.addFirst(this);
        while (l.size()!=0){
            TreeNode node = l.removeLast();
            if(node.left != null){
                l.addFirst(node.left);
            }
            if(node.right != null){
                l.addFirst(node.right);
            }
            result.add(node);
        }
        return result.stream().mapToInt((node) -> (node.val)).toArray();
    }
}

