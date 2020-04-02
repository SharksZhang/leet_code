package wordpattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	@Test
	void wordPattern() {
		assertFalse(new Solution().wordPattern("abba", "dog dog dog dog"));
		assertTrue(new Solution().wordPattern("abba", "dog cat cat dog"));
	}
}