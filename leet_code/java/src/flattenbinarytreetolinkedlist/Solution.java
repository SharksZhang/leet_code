package flattenbinarytreetolinkedlist;

import datastructue.TreeNode;

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
    public void flatten(TreeNode root) {
        TreeNode head = new TreeNode(0);
        tranverse(root);
    }

    public void tranverse(TreeNode node){
        if(node == null){
            return;
        }

        tranverse(node.left);
        tranverse(node.right);
        if(node.left != null){
            TreeNode tmp = node.right;
            node.right = node.left;
            TreeNode lastNode = node.left;

            while (lastNode.right != null){
                lastNode = lastNode.right;
            }
            lastNode.right = tmp;
            node.left = null;
        }
    }
}
