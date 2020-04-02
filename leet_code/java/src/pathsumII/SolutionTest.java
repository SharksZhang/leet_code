package pathsumII;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    TreeNode t ;
    @BeforeEach
      void setUp(){
        t = new TreeNode(5);
        TreeNode t10 = new TreeNode(4);
        TreeNode t11 = new TreeNode(8);
        TreeNode t20 = new TreeNode(11);
        TreeNode t21 = new TreeNode(13);
        TreeNode t22 = new TreeNode(4);
        TreeNode t30 = new TreeNode(7);
        TreeNode t31 = new TreeNode(2);
        TreeNode t32 = new TreeNode(5);
        TreeNode t33 = new TreeNode(1);
        t.left = t10;
        t.right = t11;
        t10.left = t20;
        t11.left = t21;
        t11.right = t22;
        t20.left = t30;
        t20.right = t31;
        t22.left = t32;
        t22.right = t33;
    }

    @Test
    void pathSum() {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(5, 4, 11, 2));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(5, 8, 4, 5));
        List<List<Integer>> result = new ArrayList<>();
        result.add(l1);
        result.add(l2);
        assertEquals(result, new Solution().pathSum(t, 22));
    }
}