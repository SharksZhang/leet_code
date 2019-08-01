package datastructue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeNodeTest {

    @Test
    void levelTraverse() {
        TreeNode t = new TreeNode(3);
        TreeNode t10 = new TreeNode(5);
        TreeNode t11 = new TreeNode(1);
        TreeNode t20 = new TreeNode(6);
        TreeNode t21 = new TreeNode(2);
        TreeNode t22 = new TreeNode(0);
        TreeNode t23 = new TreeNode(8);
        TreeNode t30 = new TreeNode(7);
        TreeNode t31 = new TreeNode(4);

        t.left = t10;
        t.right = t11;
        t10.left = t20;
        t10.right = t21;
        t11.left = t22;
        t11.right = t23;
        t21.left = t30;
        t21.right = t31;
        for (int i : t.levelTraverse()) {
            System.out.println(i);
        }
    }
}