package lowestcommonancestorofabinarytree;


import datastructue.TreeNode;

import java.util.Iterator;
import java.util.LinkedList;

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return findLowest(findDescendants(root, p), findDescendants(root, q));
    }

    public LinkedList<TreeNode> findDescendants(TreeNode root, TreeNode target) {
        LinkedList<TreeNode> tmpResult = new LinkedList();
        LinkedList<TreeNode> result = new LinkedList<>();
        tranverse(root, target, tmpResult, result);
        return new LinkedList<>(result);
    }

    public TreeNode findLowest(LinkedList<TreeNode> first, LinkedList<TreeNode> second) {
        TreeNode last = null;

        Iterator<TreeNode> iteratorFirst = first.iterator();
        Iterator<TreeNode> iteratorSecond = second.iterator();
        while (iteratorFirst.hasNext() && iteratorSecond.hasNext()) {
            TreeNode firstNext = iteratorFirst.next();
            TreeNode secondNext = iteratorSecond.next();
            if(secondNext == firstNext){
                last = firstNext;
            }
        }
        return last;
    }

    public void tranverse(TreeNode node, TreeNode target,
                          LinkedList<TreeNode> tmpResult, LinkedList<TreeNode> result) {
        if (node == null || result.size() != 0) {
            return;
        }
        tmpResult.addLast(node);
        if(node ==target){
            result.addAll(tmpResult);

        }
        tranverse(node.left, target, tmpResult, result);
        tranverse(node.right, target, tmpResult, result);
        tmpResult.removeLast();
    }
}