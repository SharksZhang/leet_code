package assigncookies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    @Test
    void should_return_1_When_just_one_children_can_get_cookie(){
        int[] childrens = new int[]{1, 2, 3};
        int[] cookies = new int[]{1, 1};
        assertEquals(1, solution.findContentChildren(childrens, cookies));
    }

    @Test
    void should_return_length_of_children_when_lots_of_cookie(){
        int[] childrens = new int[]{1, 2, 3};
        int[] cookies = new int[]{5, 5, 5, 5, 5};
        assertEquals(3, solution.findContentChildren(childrens, cookies));
    }

    @Test
    void should_return_2_When_two_children_can_get_cookie(){
        int[] childrens = new int[]{1, 2, 3};
        int[] cookies = new int[]{2, 2};
        assertEquals(2, solution.findContentChildren(childrens, cookies));
    }

    @Test
    void unsorted_list(){
        int[] childrens = new int[]{10, 9, 8, 7};
        int[] cookies = new int[]{5, 6, 7, 8};
        assertEquals(2, solution.findContentChildren(childrens, cookies));
    }




}