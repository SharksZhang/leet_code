'''
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", which the length is 3.
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring

'''


class Solution:
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        return len(self.longestSubstring(s))

    def longestSubstring(self, s):
        longest_substring = ""
        start = 0
        end = 1
        while end < len(s):
            index = str.find(s[start:end], s[end:end + 1])
            if index > -1:
                if len(longest_substring)<len(s[start:end]):
                    longest_substring = s[start:end]
                start = index + 1 + start

            end += 1
        if len(longest_substring)< len(s[start:]):
            longest_substring = s[start:]
        return longest_substring
