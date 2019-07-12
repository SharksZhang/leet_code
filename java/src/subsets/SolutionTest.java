package subsets;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    Solution1 solution1 = new Solution1();

    @Test
    void printResult() {
        for (List<Integer> subset : solution.subsets(new int[]{1, 2, 2})) {
            System.out.println(subset);
        }
    }

    @Test
    void printResult2() {
        for (List<Integer> subset : solution1.subsets(new int[]{1, 2, 3})) {
            System.out.println(subset);
        }
    }
}