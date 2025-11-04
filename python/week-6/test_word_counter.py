import unittest
from word_counter import word_counter

class TestWordsCount(unittest.TestCase):
    def test_basic_counting(self):
        sentence = "one two three one"
        expected = {'one': 2, 'two': 1, 'three': 1}
        self.assertEqual(word_counter(sentence), expected)

    def test_empty_string(self):
        sentence = ""
        expected = {'': 1}
        self.assertEqual(word_counter(sentence), expected)

    def test_whitespaces_only(self):
        sentence = "  "
        expected = {'': 3}
        self.assertEqual(word_counter(sentence), expected)


if __name__=='__main__':
    unittest.main()