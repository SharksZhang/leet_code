package majorityelement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void majorityElement() {
        System.out.println(new Solution().majorityElement(new int[]{3, 3, 4}));
    }

    @Test
    void majorityElement1() {
        System.out.println(new Solution1().majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

}