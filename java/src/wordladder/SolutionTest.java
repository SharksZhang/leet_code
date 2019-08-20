package wordladder;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	@Test
	void ladderLength() {
		String test = "1";
		LinkedList<String > list = new LinkedList<>(Arrays.asList("hot","dot","dog","lot","log","cog"));
		assertEquals(5, new Solution().ladderLength("hit", "cog", list));

	}

	@Test
	void ladderLength2() {
		String test = "1";
		LinkedList<String > list = new LinkedList<>(Arrays.asList("a","b","c"));
		assertEquals(2, new Solution().ladderLength("a", "c", list));

	}

	@Test
	void ladderLength3() {
		String test = "1";
		LinkedList<String > list = new LinkedList<>(Arrays.asList("ts","sc","ph","ca","jr","hf","to","if","ha","is","io","cf","ta"));
		assertEquals(4, new Solution().ladderLength("ta", "if", list));

	}
}