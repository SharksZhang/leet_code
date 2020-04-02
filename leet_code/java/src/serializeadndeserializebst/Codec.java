package serializeadndeserializebst;

import datastructue.TreeNode;

import java.util.Arrays;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    String result = "";
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null){
            return "";
        }
        StringBuilder result = new StringBuilder();
        traverse(root, result);
        return result.toString();
    }

    public void traverse(TreeNode node, StringBuilder result){
        if(node == null){
            return ;
        }
        result.append(node.val);
        result.append("#");
        traverse(node.left, result);
        traverse(node.right, result);
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data ==""){
            return null;
        }
        String[] arr = data.split("#");
        int[] nodeVals = Arrays.stream(arr).mapToInt((s) -> (Integer.valueOf(s))).toArray();
        if(nodeVals.length ==0){
            return null;
        }
        TreeNode root = new TreeNode(nodeVals[0]);
        for(int i =1; i< nodeVals.length; i++){
            bInsert(root, new TreeNode(nodeVals[i]));
        }
        return root;
    }

    public void bInsert(TreeNode node, TreeNode inserted){
        if(inserted.val < node.val){
            if (node.left != null) {
                bInsert(node.left, inserted);
            }else {
                node.left = inserted;
                return;
            }
        }else {
            if (node.right != null) {
                bInsert(node.right, inserted);
            }else {
                node.right = inserted;
                return;
            }
        }
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));