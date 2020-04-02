package pathsumII;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        LinkedList<Integer> tmpRes = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
        traverse(root, sum, tmpRes, result);
        return result;
    }

    void traverse(TreeNode node, int sum, LinkedList<Integer> tmpRes, List<List<Integer>> result){
        if (node ==null ){
            return;
        }
        tmpRes.addLast(node.val);
        if (node.left == null && node.right == null && sum == node.val){
            result.add(new ArrayList<>(tmpRes));
        }
        traverse(node.left, sum - node.val, tmpRes, result);
        traverse(node.right, sum-node.val, tmpRes, result);
        tmpRes.removeLast();

    }
}


// Definition for a binary tree node.

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

