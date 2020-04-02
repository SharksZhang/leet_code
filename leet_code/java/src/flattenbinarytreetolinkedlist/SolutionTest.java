package flattenbinarytreetolinkedlist;

import datastructue.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void flatten() {
        TreeNode t = new TreeNode(1);
        TreeNode t10 = new TreeNode(2);
        TreeNode t11 = new TreeNode(5);
        TreeNode t20 = new TreeNode(3);
        TreeNode t21 = new TreeNode(4);
        TreeNode t22 = new TreeNode(6);


        t.left = t10;
        t.right = t11;
        t10.left = t20;
        t10.right = t21;
        t11.right = t22;
//        assertEquals();
        new Solution().tranverse(t);
    }
}