package longestpalindrome;


class Solution {
	public int longestPalindrome(String s) {
		int[] count = new int[128];
		for(char c : s.toCharArray()){
			count[c]++;
		}
		int result = 0;
		int mid = 0;
		for (int value : count) {
			result += value % 2 == 0 ? value : value - 1;
			if (mid == 0 && value % 2 != 0) {
				mid = 1;
			}
		}

		return result + mid;
	}
}
