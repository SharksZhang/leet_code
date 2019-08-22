package wordladderII;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	@Test
	void findLadders() {
		List<List<String>> result = new Solution().findLadders("red", "tax",
				new LinkedList<>(Arrays.asList("ted", "tex", "red", "tax", "tad", "den", "rex", "pee")));
		List<List<String>> expect = new LinkedList<>();
		expect.add(new LinkedList<>(Arrays.asList("red","ted","tad","tax")));
		expect.add(new LinkedList<>(Arrays.asList("red","ted","tex","tax")));
		expect.add(new LinkedList<>(Arrays.asList("red","rex","tex","tax")));
		assertEquals(result, expect);
	}

	@Test
	void findLadders1() {
		List<List<String>> result = new Solution().findLadders("hot", "dog",
				new LinkedList<>(Arrays.asList("hot", "dog")));
		List<List<String>> expect = new LinkedList<>();
		assertEquals(result, expect);
	}
}