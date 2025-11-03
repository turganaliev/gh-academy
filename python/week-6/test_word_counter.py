import unittest
from word_counter import word_counter

class TestWordsCount(unittest.TestCase):
    def test_basic_counting(self):
        sentence = "I have to practice reading over and over and over again."
        expected = {'I': 1, 'have': 1, 'to': 1, 'practice': 1, 'reading': 1, 'over': 3, 'and': 2, 'again.': 1}
        self.assertEqual(word_counter(sentence), expected)

    def test_empty_string(self):
        sentence = ''
        expected = {'': 1}
        self.assertEqual(word_counter(sentence), expected)


if __name__=='__main__':
    unittest.main()