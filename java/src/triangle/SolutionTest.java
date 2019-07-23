package triangle;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void minimumTotal() {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> tmpList = new ArrayList<>();
        tmpList.addAll(Arrays.asList(2));
        lists.add(tmpList);
         tmpList = new ArrayList<>();
        tmpList.addAll(Arrays.asList(3, 4));
        lists.add(tmpList);

        tmpList = new ArrayList<>();
        tmpList.addAll(Arrays.asList(5, 8, 1));
        lists.add(tmpList);

        tmpList = new ArrayList<>();
        tmpList.addAll(Arrays.asList(9, 20, 15, 20));
        lists.add(tmpList);
        assertEquals(19, new Solution().minimumTotal(lists));
    }
}