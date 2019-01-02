import unittest
from LongestSubstringWithoutRepeatingCharacters_3.solution import *

class TestSolution(unittest.TestCase):
    def setUp(self):
        self.solution = Solution()

    def test_lengthOfLongestSubstring_nil(self):
        longest_substring = self.solution.lengthOfLongestSubstring("")
        self.assertEqual( "", longest_substring)
    ## const -> const+
    def test_has_no_repeating_character(self):
        longest_substring = self.solution.lengthOfLongestSubstring("abcdef")
        self.assertEqual("abcdef", longest_substring )

    def test_normal_string(self):
        longest_substring = self.solution.lengthOfLongestSubstring("abcdefedf")
        self.assertEqual("abcdef", longest_substring )


    def test_all_is_repeating_character(self):
        longest_substring = self.solution.lengthOfLongestSubstring("aaaaaa")
        self.assertEqual("a", longest_substring)


