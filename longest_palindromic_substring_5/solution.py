"""
Given a string s, find the longest palindromic substring in s.
You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
"""


class Solution:

    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
    def longest_palindrome_with_index(self, s, index):
        if s == "":
            return ""
        return self.longest_single_mid_palindrome_with_index(index, s)

    def longest_single_mid_palindrome_with_index(self, index, s):
        i = 0
        for i in range(1, index + 1):
            if index - i < 0 or index + i == len(s) or s[index - i] != s[index + i]:
                i = i - 1
                break
        return s[index - i:index + i + 1]

    def longest_double_mid_palindrome_with_index(self, s, index):
        return s[0:1]