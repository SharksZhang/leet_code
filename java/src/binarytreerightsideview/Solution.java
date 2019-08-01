package binarytreerightsideview;

import datastructue.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        if(root == null){
            return result;
        }
        LinkedList<TreeNode> preLevelNodes = new LinkedList<>();
        preLevelNodes.offer(root);
        LinkedList nextLevelNodes = new LinkedList();
        while (preLevelNodes.size() != 0){
            TreeNode node = preLevelNodes.poll();
            if (node.left != null){
                nextLevelNodes.offer(node.left);
            }
            if (node.right != null) {
                nextLevelNodes.offer(node.right);
            }

            if(preLevelNodes.size() == 0){
                preLevelNodes = nextLevelNodes;
                result.add(node.val);
                nextLevelNodes = new LinkedList();
            }
        }
        return result;
    }
}
