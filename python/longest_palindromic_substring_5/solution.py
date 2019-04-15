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
        longest_palindrome = ""
        for i in range(0, len(s)):
            palindrome = self.longest_palindrome_with_index(s, i)
            if len(longest_palindrome) < len(palindrome):
                longest_palindrome = palindrome
        return longest_palindrome
    def longest_palindrome_with_index(self, s, index):
        if s == "":
            return ""
        single_mid = self.longest_single_mid_palindrome_with_index(s, index)
        double_mid = self.longest_double_mid_palindrome_with_index(s, index)
        return  single_mid if len(single_mid) > len(double_mid) else  double_mid

    def longest_single_mid_palindrome_with_index(self, s, index):
        i = 0
        for i in range(1, index + 1):
            if index - i < 0 or index + i >= len(s) or s[index - i] != s[index + i]:
                i = i - 1
                break
        return s[index - i:index + i + 1]

    def longest_double_mid_palindrome_with_index(self, s, index):
        i = 0
        for i in range(0, index + 1):
            if index - i < 0 or index + i +1 >= len(s) or s[index - i] != s[index + i + 1]:
                i = i - 1
                break
        return s[index - i : index + i + 2]