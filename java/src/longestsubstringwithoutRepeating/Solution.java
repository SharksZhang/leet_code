package longestsubstringwithoutRepeating;

import java.util.HashMap;

class Solution {
	public int lengthOfLongestSubstring(String s) {
		int start = 0;
		int result = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (map.containsKey(cur)) {
				start = Math.max(start, map.get(cur) +1);
			}
			result = Math.max(result, i - start +1);
			map.put(cur, i);
		}
		return result;
	}
}