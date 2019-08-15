package groupanagrams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	@Test
	void test() {
		assertEquals("", new Solution().groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));;
	}
}