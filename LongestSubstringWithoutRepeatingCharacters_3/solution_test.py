import unittest
from LongestSubstringWithoutRepeatingCharacters_3.solution import *

class TestSolution(unittest.TestCase):
    def setUp(self):
        self.solution = Solution()

    def test_lengthOfLongestSubstring_nil(self):
        longest_substring = self.solution.lengthOfLongestSubstring("")
        self.assertEqual(longest_substring, "")
    ## const -> const+
    def test_lengthOfLongestSubstring_abc(self):
        longest_substring = self.solution.lengthOfLongestSubstring("abc")
        self.assertEqual(longest_substring, "abc")

    def test_lengthOfLongestSubstring_abcbe(self):
        longest_substring = self.solution.lengthOfLongestSubstring("abc")
        self.assertEqual(longest_substring, "cbe")


