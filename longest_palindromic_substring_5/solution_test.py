import unittest
from longest_palindromic_substring_5.solution import Solution

'''
bab
abba
'''


class TestSolution(unittest.TestCase):

    def test_is_palindrome_with_index_ccc(self):
        s = ""
        index = 0
        res = Solution().longest_palindrome_with_index(s, index)
        self.assertEqual(res, "")

    def test_is_palindrome_with_index_aba(self):
        s = "aba"
        index = 1
        res = Solution().longest_palindrome_with_index(s, index)
        self.assertEqual(s, res)

    def test_is_palindrome_with_index_dbcbd(self):
        s = "adbcbd"
        index = 3
        res_expect = "dbcbd"
        res = Solution().longest_palindrome_with_index(s, index)
        self.assertEqual(res_expect, res)

    def test_is_palindrome_with_index_cbdbaa(self):
        s = "cbdbaa"
        index = 2
        res_expect = "bdb"
        res = Solution().longest_palindrome_with_index(s, index)
        self.assertEqual(res_expect, res)

    # def test_is_palindrome_with_index_abbc(self):
    #     s = "abbc"
    #     index = 1
    #     resExpect = "abbc"
    #     res = Solution().longest_palindrome_with_index(s, index)
    #     self.assertEqual(resExpect, res)

    def test_longest_double_mid_palindrome_with_index(self):
        s = "bb"
        index = 0
        res_expect = "bb"
        res = Solution().longest_double_mid_palindrome_with_index(s, index)
        self.assertEqual(res_expect, res)
