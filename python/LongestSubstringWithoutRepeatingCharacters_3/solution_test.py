import unittest
from LongestSubstringWithoutRepeatingCharacters_3.solution import *

class TestSolution(unittest.TestCase):
    def setUp(self):
        self.solution = Solution()

    def test_lengthOfLongestSubstring_nil(self):
        longest_substring = self.solution.longestSubstring("")
        self.assertEqual( "", longest_substring)
    ## const -> const+
    def test_has_no_repeating_character(self):
        longest_substring = self.solution.longestSubstring("abcdef")
        self.assertEqual("abcdef", longest_substring )

    def test_normal_string(self):
        longest_substring = self.solution.longestSubstring("abcabcbb")
        self.assertEqual("abc", longest_substring )

    def test_normal_string_2(self):
        longest_substring = self.solution.longestSubstring("pwwkew")
        self.assertEqual("wke", longest_substring )

    def test_normal_string_3(self):
        longest_substring = self.solution.longestSubstring("aaabbbdefg")
        self.assertEqual("bdefg", longest_substring)

    def test_all_is_repeating_character(self):
        longest_substring = self.solution.longestSubstring("aaaaaa")
        self.assertEqual("a", longest_substring)


