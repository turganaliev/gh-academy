class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        temp = [0] * 26

        for i in range(len(s)):
            temp[ord(s[i]) - ord('a')] += 1
            temp[ord(t[i]) - ord('a')] -= 1

        for i in temp:
            if i != 0:
                return False

        return True